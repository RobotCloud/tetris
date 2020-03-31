package tetris;

import java.util.ArrayList;

/**
 * 
 * @�������ж��ܷ��ƶ�
 *
 */
public class CanMove {
	
	// �Ƿ�������
	public boolean canDecline(ArrayList<Block> blockSet) {
		boolean notMove = false;
		// ���������е�ÿһ����
		for (int i = 0 ; i < blockSet.size() ; i++) {
			// �����һ��������(���������)���򲻿��ƶ�
			if (blockSet.get(i).x >= Setting.MATRIXROW - 1) {
				notMove = true;
			} else if (ShowPanel.matrixData[blockSet.get(i).x + 1][blockSet.get(i).y] == 2) {
				// �����������У����ж������Ƿ���������
				notMove = true;
			}
		}
		if (!notMove) {
			return true;
		}
		return false;
	}
	/**
	 * 
	 * �������ж��Ƿ���������ƶ������Խ����������������飬�򲻿��ƶ�
	 * @return
	 */
	public boolean canLeftMove(ArrayList<Block> blockSet) {
		boolean notMove = false;
		for (int i = 0 ; i < blockSet.size() ; i++) {
			// �����һ�������㣬�򲻿��ƶ�
			if (blockSet.get(i).y <= 0) {
				notMove = true;
			} else if (ShowPanel.matrixData[blockSet.get(i).x][blockSet.get(i).y - 1] == 2) {
				notMove = true;
			}
		}
		if (!notMove) {
			return true;
		}
		return false;
	}
	/**
	 * �������ж��Ƿ���������ƶ������Խ����������������飬�򲻿��ƶ�
	 * @return
	 */
	public boolean canRightMove(ArrayList<Block> blockSet) {
		boolean notMove = false;
		for (int i = 0 ; i < blockSet.size() ; i++) {
			// �����һ�������㣬�򲻿��ƶ�
			if (blockSet.get(i).y >= Setting.MATRIXCOLUMN - 1) {
				notMove = true;
			} else if (ShowPanel.matrixData[blockSet.get(i).x][blockSet.get(i).y + 1] == 2) {
				notMove = true;
			}
		}
		if (!notMove) {
			return true;
		}
		return false;
	}
}
