package tetris;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class ShowPanel extends JPanel implements Runnable{

	private static final long serialVersionUID = 1L;
	
	public static int matrixData[][] = new int[Setting.MATRIXROW][Setting.MATRIXCOLUMN];
	
	private JButton jbNewStart;
	private JButton jbPause;
	private JButton jbContinue;
	private JToolBar jToolBar;
	private JButton jbClass1;
	private JButton jbClass2;
	private JButton jbClass3;
	private JButton jbQuit;
	
	CreateBlocks createBlocks = new CreateBlocks();
	Setting setting = new Setting();
	Eliminate eliminate = new Eliminate();
	CanMove canMove = new CanMove();
	Move move = new Move();
	Control control = new Control();

	public ShowPanel() {
		init();
		control.initData();		
	}

	// 初始化主界面
	public void init() {
		this.setLayout(null);
		this.setBounds(0, 0, Setting.SCREENWIDTH, Setting.SCREENHEIGHT);
		this.setBackground(Color.lightGray);
		
		jToolBar = new JToolBar();// 工具栏
		jbNewStart = new JButton("开始");
		jbPause = new JButton("暂停");
		jbContinue = new JButton("继续");
		jbClass1 = new JButton("简单");
		jbClass2 = new JButton("中等");
		jbClass3 = new JButton("困难");
		jbQuit = new JButton("退出");

		jbNewStart.setFont(new Font("宋体", Font.BOLD, 30));
		jbPause.setFont(new Font("宋体", Font.BOLD, 30));
		jbContinue.setFont(new Font("宋体", Font.BOLD, 30));
		jbClass1.setFont(new Font("宋体", Font.BOLD, 30));
		jbClass2.setFont(new Font("宋体", Font.BOLD, 30));
		jbClass3.setFont(new Font("宋体", Font.BOLD, 30));
		jbQuit.setFont(new Font("宋体", Font.BOLD, 30));

		jToolBar.setBounds(0, 0, Setting.SCREENWIDTH, 40);

		jToolBar.add(jbNewStart);
		jToolBar.add(jbPause);
		jToolBar.add(jbContinue);
		jToolBar.add(jbClass1);
		jToolBar.add(jbClass2);
		jToolBar.add(jbClass3);
		jToolBar.add(jbQuit);
		this.add(jToolBar);
		this.setVisible(true);
	}

	public void paint(Graphics g) {
		super.paint(g);
		paint1(g);
		paint2(g);
	}

	// 生成界面方块
	public void paint1(Graphics g) {
		for (int i = 0; i < Setting.MATRIXROW; i++) {
			for (int j = 0; j < Setting.MATRIXCOLUMN; j++) {
				if (matrixData[i][j] == 0) {
					g.setColor(Color.WHITE);
					g.fillRect(20 + j * 40, 50 + i * 40, 35, 35);
				}
				if (matrixData[i][j] == 1) {
					g.setColor(new Color(Setting.R, Setting.G, Setting.B));
					g.fillRect(20 + j * 40, 50 + i * 40, 35, 35);
				}
				if (matrixData[i][j] == 2) {
					g.setColor(Color.BLACK);
					g.fillRect(20 + j * 40, 50 + i * 40, 35, 35);
				}
			}
		}
	}
	// 生成基本显示组件
	public void paint2(Graphics g) {
		// 设置字体颜色
		g.setColor(Color.BLACK);
		// 设置字体大小
		g.setFont(new Font("宋体", Font.BOLD, 30));
		// 画一条分界线
		g.drawLine(420, 40, 420, 1000);
		// 画关卡
		g.drawString("困难等级: " + Setting.myClass, 450, 100);
		// 画时间
		g.drawString("时间: " + Setting.time / 1000, 450, 200);
		// 画得分
		g.drawString("得分: " + Setting.grade, 450, 300);
		// 画状态
		g.drawString("状态: " + Setting.state, 450, 400);
	}
	/**
	 * 
	 * 描述：主循环
	 */
	@Override
	public void run() {
		// 开始按钮
		jbNewStart.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				control.reset();
				control.start();
			}
		});
		// 暂停按钮
		jbPause.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Control.run = false;
				Setting.state = "暂停";
			}
		});
		// 继续按钮
		jbContinue.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Control.run = true;
				Setting.state = "游戏中";
			}
		});
		// 设置简单等级按钮
		jbClass1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Setting.myClass = 1;
				control.reset();
				control.start();
			}
		});
		// 设置中等等级按钮
		jbClass2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Setting.myClass = 2;
				control.reset();
				control.start();
			}
		});
		// 设置困难等级按钮
		jbClass3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Setting.myClass = 3;
				control.reset();
				control.start();
			}
		});
		// 游戏退出按钮
		jbQuit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				System.exit(0);
			}
		});
	
		// 键盘事件
		requestFocus();
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				int keyCode = e.getKeyCode();

				if (Control.run) {
					// 向左
					if (keyCode == KeyEvent.VK_LEFT) {
						control.isLeft = true;
					}
					// 向右
					if (keyCode == KeyEvent.VK_RIGHT) {
						control.isRight = true;
					}
					// 向上
					if (keyCode == KeyEvent.VK_UP) {
						createBlocks.transform();
					}
					// 向下
					if (keyCode == KeyEvent.VK_DOWN) {
						control.isDown = true;
					}
				}
			}
		});
		
		while (true) {
//			获取焦点
			requestFocus();
			if (Control.run) {
				try {
					Thread.sleep(10);
					Thread.yield();
				} catch (InterruptedException g) {
				}
				Setting.time += 10;

				// 判断向哪个方向移动
				if (control.isLeft) {
					if (canMove.canLeftMove(CreateBlocks.blockSet)) {
						move.leftMove();
					}
					control.isLeft = false;
				} else if (control.isRight) {
					if (canMove.canRightMove(CreateBlocks.blockSet)) {
						move.rightMove();
					}
					control.isRight = false;
				} else if (control.isUp) {

				} else if (control.isDown) {
					while (canMove.canDecline(CreateBlocks.blockSet)) {
						move.downMove();
					}
					control.isDown = false;
				}

				SwingUtilities.invokeLater(() -> {
					// 当可以继续下降时，继续下降
					if (canMove.canDecline(CreateBlocks.blockSet)) {
						if (Setting.time % Setting.speed == 0) {
							move.downMove();
						}
					} else {
						// 落到底之后，数据变为2
						for (int i = 0; i < CreateBlocks.blockSet.size(); i++) {
							int x = CreateBlocks.blockSet.get(i).x;
							int y = CreateBlocks.blockSet.get(i).y;
							matrixData[x][y] = 2;
						}
						// 判断消除
						while (eliminate.canEliminate()) {
							// 获取可消除行
							int row = eliminate.getEliminateIndex();
							// 消除一整行数据
							eliminate.eliminate(row);
							// 将被消除行上面数据整体下移一位
							move.entiretyDownMove(row);
							// 增加分数
							Setting.grade += 100;
						}
						// 清除集合
						CreateBlocks.blockSet.clear();
						//control.printData();

						// 选择创建哪个块
						CreateBlocks.select = (int) (Math.random() * 7) + 1; // 1-7
						// 选择创建块的哪个形状
						CreateBlocks.kind = (int) (Math.random() * 4 + 1); // 1-4
						// 随机创建一个形状
						if (createBlocks.createRandomBlock(CreateBlocks.select, CreateBlocks.kind)) {
							setting.setRandomColor();
							for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
								int x = CreateBlocks.blockSet.get(i).x;
								int y = CreateBlocks.blockSet.get(i).y;
								matrixData[x][y] = 1;
							}
						} else {
							// 游戏结束
							Control.run = false;
							Setting.state = "结束";
							int result = JOptionPane.showConfirmDialog(null, "游戏结束，再来一局？", "游戏结果",
									JOptionPane.YES_NO_OPTION);
							if (result == 0) {// 再来一句，刷新数据
								control.reset();
								repaint();
							} else {// 退出
								System.exit(0);
							}
						}
					}
					repaint();
				});
			}
		}
	}
}