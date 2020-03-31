package tetris;

/**
 * 
 * @�������������ݵ���
 *
 */
public class Eliminate {
	/**
	 * 
	 * ��������û�п�����������
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
	 * ��������ȡһ���������е��±�
	 */
	public int getEliminateIndex() {
		// ĳһ���Ƿ��ܱ�����
		boolean canEliminate = false;
		for (int i = Setting.MATRIXROW - 1 ; i >= 0 ; i--) {
			// ����һ������
			for (int j = 0;j < Setting.MATRIXCOLUMN ; j++) {
				if (ShowPanel.matrixData[i][j] == 2) {
					canEliminate = true;
				} else {
					// ����һ�������㣬ֱ���˳���������һ��
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
	 * ����������ָ��һ���е�����
	 * @param i
	 */
	public void eliminate(int i) {
		for (int t = 0 ; t < Setting.MATRIXCOLUMN ; t++) {
			ShowPanel.matrixData[i][t] = 0;
		}
	}
}
