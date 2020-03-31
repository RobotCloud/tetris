package tetris;

/**
 * 
 * @�������ƶ���
 *
 */
public class Move {
	/**
	 * ���������ݣ��飩���ƣ�������Ϊ1����������һ��
	 */
	public void downMove() {
		// ԭλ�õ���������
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			ShowPanel.matrixData[CreateBlocks.blockSet.get(i).x][CreateBlocks.blockSet.get(i).y] = 0;
		}
		// �ı�λ��
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			CreateBlocks.blockSet.get(i).x++;
		}
		// ������λ������
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			ShowPanel.matrixData[CreateBlocks.blockSet.get(i).x][CreateBlocks.blockSet.get(i).y] = 1;
		}
	}
	/**
	 * ��������������
	 */
	public void leftMove() {
		// ԭλ�õ���������
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			ShowPanel.matrixData[CreateBlocks.blockSet.get(i).x][CreateBlocks.blockSet.get(i).y] = 0;
		}
		// �ı�λ��
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			CreateBlocks.blockSet.get(i).y--;
		}
		// ������λ������
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			ShowPanel.matrixData[CreateBlocks.blockSet.get(i).x][CreateBlocks.blockSet.get(i).y] = 1;
		}
	}
	/**
	 * ��������������
	 */
	public void rightMove() {
		// ԭλ�õ���������
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			ShowPanel.matrixData[CreateBlocks.blockSet.get(i).x][CreateBlocks.blockSet.get(i).y] = 0;
		}
		// �ı�λ��
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			CreateBlocks.blockSet.get(i).y++;
		}
		// ������λ������
		for (int i = 0 ; i < CreateBlocks.blockSet.size() ; i++) {
			ShowPanel.matrixData[CreateBlocks.blockSet.get(i).x][CreateBlocks.blockSet.get(i).y] = 1;
		}		
	}
	/**
	 * ���������е��������п飬����һλ
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
