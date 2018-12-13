package singletonDemo;
/**
 * 
 * @author hz
 *
 */
public class Hungry {
	
	private Hungry(){
		
	}
	
	private static Hungry hs = new Hungry();
	
	public static Hungry  get() {
		
		return hs;
	}
	
}
