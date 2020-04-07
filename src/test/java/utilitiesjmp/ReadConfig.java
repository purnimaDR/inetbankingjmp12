package utilitiesjmp;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	// class of java.util.Properties;

	// create

	public ReadConfig()

	{

		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);

			pro = new Properties(); // pro is object of Properties
			pro.load(fis);// method to load the complete config.properties file at the run time.
		}

		catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}

	public String getChromePath() {
		String chromePath = pro.getProperty("chromepath");
		return chromePath;
	}

	public String getIEPath() {
		String iePath = pro.getProperty("iepath");
		return iePath;
	}

	public String FirefoxPath() {
		String FirefoxPath = pro.getProperty("firefoxpath");
		return FirefoxPath;
	}
}

