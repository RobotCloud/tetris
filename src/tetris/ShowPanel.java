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

	// ��ʼ��������
	public void init() {
		this.setLayout(null);
		this.setBounds(0, 0, Setting.SCREENWIDTH, Setting.SCREENHEIGHT);
		this.setBackground(Color.lightGray);
		
		jToolBar = new JToolBar();// ������
		jbNewStart = new JButton("��ʼ");
		jbPause = new JButton("��ͣ");
		jbContinue = new JButton("����");
		jbClass1 = new JButton("��");
		jbClass2 = new JButton("�е�");
		jbClass3 = new JButton("����");
		jbQuit = new JButton("�˳�");

		jbNewStart.setFont(new Font("����", Font.BOLD, 30));
		jbPause.setFont(new Font("����", Font.BOLD, 30));
		jbContinue.setFont(new Font("����", Font.BOLD, 30));
		jbClass1.setFont(new Font("����", Font.BOLD, 30));
		jbClass2.setFont(new Font("����", Font.BOLD, 30));
		jbClass3.setFont(new Font("����", Font.BOLD, 30));
		jbQuit.setFont(new Font("����", Font.BOLD, 30));

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

	// ���ɽ��淽��
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
	// ���ɻ�����ʾ���
	public void paint2(Graphics g) {
		// ����������ɫ
		g.setColor(Color.BLACK);
		// ���������С
		g.setFont(new Font("����", Font.BOLD, 30));
		// ��һ���ֽ���
		g.drawLine(420, 40, 420, 1000);
		// ���ؿ�
		g.drawString("���ѵȼ�: " + Setting.myClass, 450, 100);
		// ��ʱ��
		g.drawString("ʱ��: " + Setting.time / 1000, 450, 200);
		// ���÷�
		g.drawString("�÷�: " + Setting.grade, 450, 300);
		// ��״̬
		g.drawString("״̬: " + Setting.state, 450, 400);
	}
	/**
	 * 
	 * ��������ѭ��
	 */
	@Override
	public void run() {
		// ��ʼ��ť
		jbNewStart.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				control.reset();
				control.start();
			}
		});
		// ��ͣ��ť
		jbPause.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Control.run = false;
				Setting.state = "��ͣ";
			}
		});
		// ������ť
		jbContinue.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Control.run = true;
				Setting.state = "��Ϸ��";
			}
		});
		// ���ü򵥵ȼ���ť
		jbClass1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Setting.myClass = 1;
				control.reset();
				control.start();
			}
		});
		// �����еȵȼ���ť
		jbClass2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Setting.myClass = 2;
				control.reset();
				control.start();
			}
		});
		// �������ѵȼ���ť
		jbClass3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Setting.myClass = 3;
				control.reset();
				control.start();
			}
		});
		// ��Ϸ�˳���ť
		jbQuit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				System.exit(0);
			}
		});
	
		// �����¼�
		requestFocus();
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				int keyCode = e.getKeyCode();

				if (Control.run) {
					// ����
					if (keyCode == KeyEvent.VK_LEFT) {
						control.isLeft = true;
					}
					// ����
					if (keyCode == KeyEvent.VK_RIGHT) {
						control.isRight = true;
					}
					// ����
					if (keyCode == KeyEvent.VK_UP) {
						createBlocks.transform();
					}
					// ����
					if (keyCode == KeyEvent.VK_DOWN) {
						control.isDown = true;
					}
				}
			}
		});
		
		while (true) {
//			��ȡ����
			requestFocus();
			if (Control.run) {
				try {
					Thread.sleep(10);
					Thread.yield();
				} catch (InterruptedException g) {
				}
				Setting.time += 10;

				// �ж����ĸ������ƶ�
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
					// �����Լ����½�ʱ�������½�
					if (canMove.canDecline(CreateBlocks.blockSet)) {
						if (Setting.time % Setting.speed == 0) {
							move.downMove();
						}
					} else {
						// �䵽��֮�����ݱ�Ϊ2
						for (int i = 0; i < CreateBlocks.blockSet.size(); i++) {
							int x = CreateBlocks.blockSet.get(i).x;
							int y = CreateBlocks.blockSet.get(i).y;
							matrixData[x][y] = 2;
						}
						// �ж�����
						while (eliminate.canEliminate()) {
							// ��ȡ��������
							int row = eliminate.getEliminateIndex();
							// ����һ��������
							eliminate.eliminate(row);
							// ��������������������������һλ
							move.entiretyDownMove(row);
							// ���ӷ���
							Setting.grade += 100;
						}
						// �������
						CreateBlocks.blockSet.clear();
						//control.printData();

						// ѡ�񴴽��ĸ���
						CreateBlocks.select = (int) (Math.random() * 7) + 1; // 1-7
						// ѡ�񴴽�����ĸ���״
						CreateBlocks.kind = (int) (Math.random() * 4 + 1); // 1-4
						// �������һ����״
						if (createBlocks.createRandomBlock(CreateBlocks.select, CreateBlocks.kind)) {
							setting.setRandomColor();
							for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
								int x = CreateBlocks.blockSet.get(i).x;
								int y = CreateBlocks.blockSet.get(i).y;
								matrixData[x][y] = 1;
							}
						} else {
							// ��Ϸ����
							Control.run = false;
							Setting.state = "����";
							int result = JOptionPane.showConfirmDialog(null, "��Ϸ����������һ�֣�", "��Ϸ���",
									JOptionPane.YES_NO_OPTION);
							if (result == 0) {// ����һ�䣬ˢ������
								control.reset();
								repaint();
							} else {// �˳�
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