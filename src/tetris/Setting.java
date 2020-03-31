package tetris;

/**
 * 
 * @描述：游戏设置
 *
 */
public class Setting {
	final static int SCREENWIDTH = 700;
	final static int SCREENHEIGHT = 900;
	final static int MATRIXROW = 20;
	final static int MATRIXCOLUMN = 10;
	public static int grade; // 分数
	public static int time; // 时间
	public static int speed; // 速度/ms
	public static int myClass; // 等级
	public static String state; // 游戏状态显示
	public static int R;
	public static int G;
	public static int B;
	
	public Setting() {
		grade = 0;
		time = 0;
		speed = 800;
		myClass = 1;
		state = "暂停";
	}
	// 选择游戏难度
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
	// 随机生成RGB，用于设置颜色
	public void setRandomColor() {
		R = (int)(Math.random() * 256);
		G = (int)(Math.random() * 256);
		B = (int)(Math.random() * 256);
	}
}
