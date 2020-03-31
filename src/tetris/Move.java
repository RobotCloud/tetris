package tetris;

/**
 * 
 * @描述：移动块
 *
 */
public class Move {
	/**
	 * 描述：数据（块）下移，（所有为1的数据下移一格）
	 */
	public void downMove() {
		// 原位置的数据清零
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			ShowPanel.matrixData[CreateBlocks.blockSet.get(i).x][CreateBlocks.blockSet.get(i).y] = 0;
		}
		// 改变位置
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			CreateBlocks.blockSet.get(i).x++;
		}
		// 设置新位置数据
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			ShowPanel.matrixData[CreateBlocks.blockSet.get(i).x][CreateBlocks.blockSet.get(i).y] = 1;
		}
	}
	/**
	 * 描述：数据左移
	 */
	public void leftMove() {
		// 原位置的数据清零
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			ShowPanel.matrixData[CreateBlocks.blockSet.get(i).x][CreateBlocks.blockSet.get(i).y] = 0;
		}
		// 改变位置
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			CreateBlocks.blockSet.get(i).y--;
		}
		// 设置新位置数据
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			ShowPanel.matrixData[CreateBlocks.blockSet.get(i).x][CreateBlocks.blockSet.get(i).y] = 1;
		}
	}
	/**
	 * 描述：数据右移
	 */
	public void rightMove() {
		// 原位置的数据清零
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			ShowPanel.matrixData[CreateBlocks.blockSet.get(i).x][CreateBlocks.blockSet.get(i).y] = 0;
		}
		// 改变位置
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			CreateBlocks.blockSet.get(i).y++;
		}
		// 设置新位置数据
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			ShowPanel.matrixData[CreateBlocks.blockSet.get(i).x][CreateBlocks.blockSet.get(i).y] = 1;
		}		
	}
	/**
	 * 将被消除行的上面所有块，下移一位
	 */
	public void entiretyDownMove(int row) {
		for (int i = row - 1 ; i >= 0 ; i--) {
			for (int j = 0 ; j < Setting.MATRIXCOLUMN ; j++) {
				if (ShowPanel.matrixData[i][j] == 2) {
					ShowPanel.matrixData[i][j] = 0;
					ShowPanel.matrixData[i + 1][j] = 2;
				}
			}
		}
	}
}
