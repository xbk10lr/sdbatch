package com.sd.batch.base.utils.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.sd.batch.dto.generate.DownOrder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BaseFileUtil {

    /**
     * @Title: fileParsing 
     * @Description: 根据fileid 获取对账文件格式，并解析对账文件
     * @param fileReader
     * @throws IOException 对方法的参数进行描述
     * @return List<Map<String,String>> 返回类型
     * @throws Exception 
     */
    public  List<DownOrder> fileParsing(File file,String fileId) throws Exception  {
        if(file == null ){
            return null;
        }
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new  BufferedReader(fileReader);
            String alineString ;
            FileFormat fileFormat = FileFormatFactory.getFileFormat(fileId);
            if(fileFormat == null){
            	log.error("get file format error, wrong fileId");
            	throw new Exception("get file format error, wrong fileId");
            }
            List<DownOrder> fileReadMaps = new ArrayList<DownOrder>();
            while((alineString=bufferedReader.readLine())!=null){
            	if(fileFormat.isSkipBeginLine()){
            		//跳过首行
            		continue;
            	}
            	String[] readArray = alineString.split(fileFormat.getLineSeparator());        //拆分读取的数据
            	List<String> fields = fileFormat.getFields();
            	//判断文件格式是否符合
            	if(readArray.length == fields.size()){
            		for(int i=0;i<readArray.length;i++){
            			Map<String, String> fileReadMap = new LinkedHashMap<String, String>();
            			fileReadMap.put(fields.get(i), readArray[i]);        //Map第一个键存放接口号
            			DownOrder downOrder = parseMapToDownOrder(fileReadMap);
            			fileReadMaps.add(downOrder);
            		}
            	} else {
            		log.error("Error of File Format!"); 
            		throw new Exception("Error of File Format!");
            	}
            }
            return fileReadMaps;
        } catch (Exception e1) {
            log.error(e1.getMessage(),e1);
            throw e1;
        } finally {
            
            try{
                if(null != bufferedReader)
                    bufferedReader.close();
            }catch(Exception e){
                log.error(e.getMessage(),e);
            }
            try{
                if(null != fileReader)
                    fileReader.close();
            }catch(Exception e){
                log.error(e.getMessage(),e);
            }
        }
    }

	protected abstract DownOrder parseMapToDownOrder(Map<String, String> map);
}