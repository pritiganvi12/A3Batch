package GenericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileLibrary {
	public  String fetchDataFromProperties(String path, String key) {
		File f=new File(path);
		try {
		FileInputStream fis=new FileInputStream(f);
		 prop=new Properties();
		prop.load(fis);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	String	   data=prop.getProperty(key);//to fetch prorperty this method use
	return data;
	}

}
