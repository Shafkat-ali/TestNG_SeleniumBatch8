package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class testDataReader {
	
			//ConfigurationReader
	

	static Properties testDataFile;

	static {

		try {
			// On this part you are declaring / telling the path of the properties file.
			String filePath = "src/test/resources/testData/projectData.properties";
			FileInputStream input = new FileInputStream(filePath);

			testDataFile = new Properties();

			testDataFile.load(input);

			input.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	} //closing static bracket

	public static String getProperty(String keyName) {
		return testDataFile.getProperty(keyName);
	}

} /// class level
