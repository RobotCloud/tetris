package tetris;

/**
 * 
 * @描述：游戏控制
 *
 */
public class Control {
	// 向哪个方向移动
	public boolean isLeft = false;
	public boolean isRight = false;
	public boolean isUp = false;
	public boolean isDown = false;
	
	public static boolean run = false; // 运行状态
	
	CreateBlocks createBlocks = new CreateBlocks();
	Setting setting = new Setting();
	
	// 重置数据
	public void reset() {
		initData();
		run = false;
		Setting.time = 0;
		Setting.grade = 0;
		CreateBlocks.blockSet.clear();
	}
	// 开始游戏
	public void start() {
		// 选择创建哪个块
		CreateBlocks.select = (int) (Math.random() * 7) + 1; // 1-7
		// 选择创建块的哪个形状
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
		Setting.state = "游戏中";
		run = true;
	}
	// 初始化后台数据
	public void initData() {
		for (int i = 0; i < Setting.MATRIXROW; i++) {
			for (int j = 0; j < Setting.MATRIXCOLUMN; j++) {
				ShowPanel.matrixData[i][j] = 0;
			}
		}
	}
	// 打印数据
	public void printData() {
		for (int i = 0; i < Setting.MATRIXROW; i++) {
			for (int j = 0; j < Setting.MATRIXCOLUMN; j++) {
				System.out.print(ShowPanel.matrixData[i][j] + " ");
			}
			System.out.println();
		}
	}
}
