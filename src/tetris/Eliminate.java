package tetris;

/**
 * 
 * @描述：消除数据的类
 *
 */
public class Eliminate {
	/**
	 * 
	 * 描述：有没有可以消除的行
	 * @return
	 */
	public boolean canEliminate() {
		int canEliminateCount = 0;
		for (int i = Setting.MATRIXROW - 1 ; i >= 0 ; i--) {
			for (int j = 0 ; j < Setting.MATRIXCOLUMN ; j++) {
				if (ShowPanel.matrixData[i][j] == 2) {
					canEliminateCount++;
				} else {
					canEliminateCount = 0;
					break;
				}
			}
			if (canEliminateCount == Setting.MATRIXCOLUMN) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 描述：获取一个可消除行的下标
	 */
	public int getEliminateIndex() {
		// 某一行是否能被消除
		boolean canEliminate = false;
		for (int i = Setting.MATRIXROW - 1 ; i >= 0 ; i--) {
			// 查找一行数据
			for (int j = 0;j < Setting.MATRIXCOLUMN ; j++) {
				if (ShowPanel.matrixData[i][j] == 2) {
					canEliminate = true;
				} else {
					// 当有一个不满足，直接退出，查找下一行
					canEliminate = false;
					break;
				}
			}
			if (canEliminate) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * 
	 * 描述：消除指定一整行的数据
	 * @param i
	 */
	public void eliminate(int i) {
		for (int t = 0 ; t < Setting.MATRIXCOLUMN ; t++) {
			ShowPanel.matrixData[i][t] = 0;
		}
	}
}
