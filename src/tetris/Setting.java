package tetris;

/**
 * 
 * @��������Ϸ����
 *
 */
public class Setting {
	final static int SCREENWIDTH = 700;
	final static int SCREENHEIGHT = 900;
	final static int MATRIXROW = 20;
	final static int MATRIXCOLUMN = 10;
	public static int grade; // ����
	public static int time; // ʱ��
	public static int speed; // �ٶ�/ms
	public static int myClass; // �ȼ�
	public static String state; // ��Ϸ״̬��ʾ
	public static int R;
	public static int G;
	public static int B;
	
	public Setting() {
		grade = 0;
		time = 0;
		speed = 800;
		myClass = 1;
		state = "��ͣ";
	}
	// ѡ����Ϸ�Ѷ�
	public void setClass(int myClass) {
		Setting.myClass = myClass;
		if (myClass == 1) {
			speed = 800;
		} else if (myClass == 2) {
			speed = 500;
		} else if (myClass == 3) {
			speed = 300;
		}
	}
	// �������RGB������������ɫ
	public void setRandomColor() {
		R = (int)(Math.random() * 256);
		G = (int)(Math.random() * 256);
		B = (int)(Math.random() * 256);
	}
}
