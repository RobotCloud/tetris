package tetris;

import java.util.ArrayList;

/**
 * 
 * @描述：判断能否移动
 *
 */
public class CanMove {
	
	// 是否能下移
	public boolean canDecline(ArrayList<Block> blockSet) {
		boolean notMove = false;
		// 遍历集合中的每一个块
		for (int i = 0 ; i < blockSet.size() ; i++) {
			// 如果有一个不满足(到达最底行)，则不可移动
			if (blockSet.get(i).x >= Setting.MATRIXROW - 1) {
				notMove = true;
			} else if (ShowPanel.matrixData[blockSet.get(i).x + 1][blockSet.get(i).y] == 2) {
				// 如果不是最底行，则判断下面是否有其它块
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
	 * 描述：判断是否可以向左移动，如果越界或者左面有其它块，则不可移动
	 * @return
	 */
	public boolean canLeftMove(ArrayList<Block> blockSet) {
		boolean notMove = false;
		for (int i = 0 ; i < blockSet.size() ; i++) {
			// 如果有一个不满足，则不可移动
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
	 * 描述：判断是否可以向右移动，如果越界或者右面有其它块，则不可移动
	 * @return
	 */
	public boolean canRightMove(ArrayList<Block> blockSet) {
		boolean notMove = false;
		for (int i = 0 ; i < blockSet.size() ; i++) {
			// 如果有一个不满足，则不可移动
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
