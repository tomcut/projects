package factoryModel;

import org.junit.Test;

/**
 * Ð¬×Ó¿Í»§¶Ë
 * @author tarena
 *
 */
public class Client {
   ShoesFactory factory=new ShoesFactory();
   @Test
   public void getShoes(){
	   ShoesInterface shoes=
			   factory.getShoes("LiNing");
	   shoes.makeShoes();
   }
   
   
   
   @Test
   public void getShoesByClassName(){
	   try {
		ShoesInterface shoes=
				   factory.getShoesByClassName
				   ("factoryModel.NikeShoes");
		shoes.makeShoes();
	} catch (Exception e) {
		e.printStackTrace();
	}
   }
   
   @Test
   public void getShoesByclassKey(){
	   ShoesInterface shoes=
	       factory.getShoesByClassKey("Nike");
	   shoes.makeShoes();
   }
   
   
   
   
}
