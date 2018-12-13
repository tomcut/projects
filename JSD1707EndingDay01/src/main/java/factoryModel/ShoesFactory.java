package factoryModel;

import java.util.Map;

/**
 * 鞋子工厂
 * @author tarena
 *
 */
public class ShoesFactory {
	/**
	 * 根据类型来创建鞋子实例
	 * @param key :鞋子类型
	 * @return
	 */
   public ShoesInterface getShoes(String key){
	   if("Nike".equals(key)){
		   return new NikeShoes();
	   }else if("LiNing".equals(key)){
		   return new LiNingShoes();
	   }else{
		   throw new RuntimeException
		   ("没有该类型的鞋子");
	   }
   }
   
   /**
    * 
    * @param className:完整的类路径
    * @return  ：鞋子实例
    * @throws Exception
    */
   public ShoesInterface 
       getShoesByClassName(String className) throws Exception{
	   Class cls=Class.forName(className);
	   ShoesInterface shoes=
			   (ShoesInterface) cls.newInstance();
	   return shoes;
   }
   
   public ShoesInterface getShoesByClassKey(String key){
	   Map<String,Object> map=
			   new PropertiesParse().getProperties();
	   String values=(String) map.get(key);
	   try {
		Class cls=Class.forName(values);
		ShoesInterface shoes=
				(ShoesInterface) cls.newInstance();
		return shoes;
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
   }
   
   
   
   
   
   
   
   
}
