package factoryModel;

import java.util.Map;

/**
 * Ь�ӹ���
 * @author tarena
 *
 */
public class ShoesFactory {
	/**
	 * ��������������Ь��ʵ��
	 * @param key :Ь������
	 * @return
	 */
   public ShoesInterface getShoes(String key){
	   if("Nike".equals(key)){
		   return new NikeShoes();
	   }else if("LiNing".equals(key)){
		   return new LiNingShoes();
	   }else{
		   throw new RuntimeException
		   ("û�и����͵�Ь��");
	   }
   }
   
   /**
    * 
    * @param className:��������·��
    * @return  ��Ь��ʵ��
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
