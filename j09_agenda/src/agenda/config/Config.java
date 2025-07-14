package agenda.config;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class Config {
	
	private static DataSource ds;
	public static Properties prop;
	
	
	private Config() {}
	
	public static DataSource getDataSource() {
		if(ds == null) {
			BasicDataSource bds = new BasicDataSource();
			Properties prop = getProp();
			bds.setUrl(prop.getProperty("bbdd.url"));
			bds.setDriverClassName(prop.getProperty("bbdd.driver"));
			bds.setUsername(prop.getProperty("bbdd.user"));
			bds.setPassword(prop.getProperty("bbdd.pass"));
			ds=bds;
		}
		
		return ds;
	}


	
	public static Properties getProp() {
		if(prop == null) {
			prop = new Properties();
			
			try (FileReader fr = new FileReader("app.properties")){
				prop.load(fr);
				
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("No se puede leer el fichero de properties");
			}
		}
		return prop;
	}

}
