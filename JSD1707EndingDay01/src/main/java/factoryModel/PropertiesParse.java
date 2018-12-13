package factoryModel;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 类属性文件解析类
 * @author tarena
 *
 */
public class PropertiesParse {
  public Map<String,Object> getProperties(){
	  Properties prop=new Properties();
	  Map<String,Object> map=
			  new HashMap<String, Object>();
	  try {
		InputStream in=this.getClass().getClassLoader().
		getResourceAsStream("type.properties");
		prop.load(in);
		Enumeration en=prop.propertyNames();
		while(en.hasMoreElements()){
			String key=(String) en.nextElement();
			String value=prop.getProperty(key);
			
			map.put(key, value);
		}
		return map;
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
  }
  
  public static void main(String[] args) {
	System.out.println
	(new PropertiesParse().getProperties());
  }
}
