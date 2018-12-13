package singletonDemo;
/**
 * 单例模式之饿汉模式
 * 优点：获取类的实例较快
 * 缺点: 类加载相对于懒汉模式较慢
 * 适用场景:对象较为轻量级，适用比较频繁的时候
 * @author tarena
 *
 */
public class HungrySinleton {
     /**
      * 1.构造方法私有化
      */
	private HungrySinleton(){
		
	}
	/**
	 * 2.声明当前类的静态实例，并实例化
	 */
    private static HungrySinleton hs=
    		new HungrySinleton();
    
    /**
     * 3.提供静态工厂方法来给外界返回当前
     *   类的实例
     */
    public static HungrySinleton getInstance(){
    	return hs;
    }
	
	public static void main(String[] args) {
		System.out.println
		(HungrySinleton.getInstance()==
		HungrySinleton.getInstance());
	}
}
