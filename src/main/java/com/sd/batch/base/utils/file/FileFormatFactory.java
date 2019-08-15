package com.sd.batch.base.utils.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileFormatFactory {

	private static final String FORMAT_PATH = "src/main/resources/checkFileFormat/checkfile.xml";

	public static FileFormat getFileFormat(String fileId) {
		try {
			File inputFile = new File(FORMAT_PATH);
			SAXReader reader = new SAXReader();
			Document document = reader.read(inputFile);
			Element root = document.getRootElement();
			Iterator<Element> it = root.elementIterator("file");
			FileFormat ff = null;
			while (it.hasNext()) {
				Element element = it.next();
				if (fileId.equals(element.attributeValue("id"))) {
					ff = new FileFormat();
					ff.setEncoding(element.attributeValue("encoding"));
					ff.setId(fileId);
					ff.setLineSeparator(element.attributeValue("lineSeparator"));
					ff.setSkipBeginLine(Boolean.valueOf(element.attributeValue("skipBeginLine")));
					ff.setSkipEndLine(Boolean.valueOf(element.attributeValue("skipEndLine")));
					List<Element> elements = element.elements("field");
					List<String> fields = new ArrayList<String>();
					for(Element e:elements){
						fields.add(e.attributeValue("name"));
					}
					ff.setFields(fields);
				} else {
					continue;
				}
			}
			return ff;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return null;
		}
	}
}
