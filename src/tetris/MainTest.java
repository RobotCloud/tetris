package tetris;

import javax.swing.JFrame;

/**
 * 
 * @author MaxRobot
 * @邮箱：15141954116@163.com @修改日期：2020.3.31
 * @描述：俄罗斯方块小游戏
 *
 */
public class MainTest{

	public static void main(String[] args) {

		JFrame jFrame = new JFrame();
		jFrame.setTitle("俄罗斯方块");
		jFrame.setLayout(null);
		jFrame.setBounds(500, 50, Setting.SCREENWIDTH, Setting.SCREENHEIGHT);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ShowPanel showPanel = new ShowPanel();
		jFrame.add(showPanel);

		Thread thread1 = new Thread(showPanel);
		thread1.start();

		jFrame.setVisible(true);

	}
}
