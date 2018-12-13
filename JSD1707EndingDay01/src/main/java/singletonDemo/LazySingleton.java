package singletonDemo;
/**
 * ����ģʽ֮����ģʽ
 * �ŵ㣺����ؿ�
 * ȱ��:����ڶ���ģʽ��˵����ȡ���ʵ������
 * ���ó���:����Ķ���Ƚ�������ʱ��ʹ�ô�������
 *         ��Ƶ����ʱ��
 * @author tarena
 *
 */
public class LazySingleton {
  /**
   * 1.���췽��˽�л�
   */
	private LazySingleton(){
		
	}
	/**
	 * 2.������ǰ��ľ�̬ʵ�������ǲ�ʵ����
	 */
	private static LazySingleton ls;
	/**
	 * 3.�ṩ��̬�������������ص�ǰ��ľ�̬ʵ��
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
