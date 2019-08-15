package com.upp.batch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sd.batch.base.utils.file.FileFormatFactory;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=UppBatchApplicationTests.class)
public class UppBatchApplicationTests {

	@Test
	public void contextLoads() {
		try {
			FileFormatFactory.getFileFormat("mockCheckFile");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

