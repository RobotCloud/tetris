package tetris;

import javax.swing.JFrame;

/**
 * 
 * @author MaxRobot
 * @���䣺15141954116@163.com @�޸����ڣ�2020.3.31
 * @����������˹����С��Ϸ
 *
 */
public class MainTest{

	public static void main(String[] args) {

		JFrame jFrame = new JFrame();
		jFrame.setTitle("����˹����");
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
