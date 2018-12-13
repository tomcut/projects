package singletonDemo;
/**
 * ����ģʽ֮����ģʽ
 * �ŵ㣺��ȡ���ʵ���Ͽ�
 * ȱ��: ��������������ģʽ����
 * ���ó���:�����Ϊ�����������ñȽ�Ƶ����ʱ��
 * @author tarena
 *
 */
public class HungrySinleton {
     /**
      * 1.���췽��˽�л�
      */
	private HungrySinleton(){
		
	}
	/**
	 * 2.������ǰ��ľ�̬ʵ������ʵ����
	 */
    private static HungrySinleton hs=
    		new HungrySinleton();
    
    /**
     * 3.�ṩ��̬��������������緵�ص�ǰ
     *   ���ʵ��
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
