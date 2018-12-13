package singletonDemo;
/**
 * 单例模式之懒汉模式
 * 优点：类加载快
 * 缺点:相对于饿汉模式来说，获取类的实例较慢
 * 适用场景:当类的对象比较重量级时，使用次数不是
 *         很频繁的时候
 * @author tarena
 *
 */
public class LazySingleton {
  /**
   * 1.构造方法私有化
   */
	private LazySingleton(){
		
	}
	/**
	 * 2.声明当前类的静态实例：但是不实例化
	 */
	private static LazySingleton ls;
	/**
	 * 3.提供静态工厂方法来返回当前类的静态实例
	 */
	public static LazySingleton getInstance(){
		if(ls==null){
			synchronized (LazySingleton.class) {
				if(ls==null){
					ls=new LazySingleton();
			}
		}
		
	}
		return ls;
	}
	
	public static void main(String[] args) {
		System.out.println
		(LazySingleton.getInstance()
				==LazySingleton.getInstance());
	}
}
