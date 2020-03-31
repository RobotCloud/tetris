package tetris;

/**
 * 
 * @��������Ϸ����
 *
 */
public class Control {
	// ���ĸ������ƶ�
	public boolean isLeft = false;
	public boolean isRight = false;
	public boolean isUp = false;
	public boolean isDown = false;
	
	public static boolean run = false; // ����״̬
	
	CreateBlocks createBlocks = new CreateBlocks();
	Setting setting = new Setting();
	
	// ��������
	public void reset() {
		initData();
		run = false;
		Setting.time = 0;
		Setting.grade = 0;
		CreateBlocks.blockSet.clear();
	}
	// ��ʼ��Ϸ
	public void start() {
		// ѡ�񴴽��ĸ���
		CreateBlocks.select = (int) (Math.random() * 7) + 1; // 1-7
		// ѡ�񴴽�����ĸ���״
		CreateBlocks.kind = (int) (Math.random() * 4 + 1); // 1-4
		if (createBlocks.createRandomBlock(CreateBlocks.select, CreateBlocks.kind)) {
			for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
				int x = CreateBlocks.blockSet.get(i).x;
				int y = CreateBlocks.blockSet.get(i).y;
				ShowPanel.matrixData[x][y] = 1;
			}
		}
		setting.setRandomColor();
		setting.setClass(Setting.myClass);
		Setting.state = "��Ϸ��";
		run = true;
	}
	// ��ʼ����̨����
	public void initData() {
		for (int i = 0; i < Setting.MATRIXROW; i++) {
			for (int j = 0; j < Setting.MATRIXCOLUMN; j++) {
				ShowPanel.matrixData[i][j] = 0;
			}
		}
	}
	// ��ӡ����
	public void printData() {
		for (int i = 0; i < Setting.MATRIXROW; i++) {
			for (int j = 0; j < Setting.MATRIXCOLUMN; j++) {
				System.out.print(ShowPanel.matrixData[i][j] + " ");
			}
			System.out.println();
		}
	}
}
