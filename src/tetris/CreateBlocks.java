package tetris;

import java.util.ArrayList;

/**
 * 
 * @������������
 *
 */
public class CreateBlocks {

	// �洢�ĸ�����б�
	static ArrayList<Block> blockSet = new ArrayList<Block>();

	/**
	 * �������ĸ���״�Ŀ�
	 */
	static int select;
	/**
	 * ������ķ���
	 */
	static int kind;

	// �����������ĸ���
	public void createBlocks() {
		Block block1 = new Block(0, 0);
		Block block2 = new Block(0, 0);
		Block block3 = new Block(0, 0);
		Block block4 = new Block(0, 0);
		blockSet.add(block1);
		blockSet.add(block2);
		blockSet.add(block3);
		blockSet.add(block4);
	}

	// ���� I ��״
	public void IBlock(int kind, int x, int y) {
		blockSet.get(0).x = x;
		blockSet.get(0).y = y;
		if (kind == 1 || kind == 3) {
			blockSet.get(1).x = blockSet.get(0).x;
			blockSet.get(1).y = blockSet.get(0).y + 1;
			blockSet.get(2).x = blockSet.get(1).x;
			blockSet.get(2).y = blockSet.get(1).y + 1;
			blockSet.get(3).x = blockSet.get(2).x;
			blockSet.get(3).y = blockSet.get(2).y + 1;
		} else if (kind == 2 || kind == 4) {
			blockSet.get(1).x = blockSet.get(0).x + 1;
			blockSet.get(1).y = blockSet.get(0).y;
			blockSet.get(2).x = blockSet.get(1).x + 1;
			blockSet.get(2).y = blockSet.get(1).y;
			blockSet.get(3).x = blockSet.get(2).x + 1;
			blockSet.get(3).y = blockSet.get(2).y;
		}
	}

	// ���� O ��״
	public void OBlock(int kind, int x, int y) {
		blockSet.get(0).x = x;
		blockSet.get(0).y = y;
		if (kind == 1 || kind == 2 || kind == 3 || kind == 4) {
			blockSet.get(1).x = blockSet.get(0).x;
			blockSet.get(1).y = blockSet.get(0).y + 1;
			blockSet.get(2).x = blockSet.get(1).x + 1;
			blockSet.get(2).y = blockSet.get(1).y - 1;
			blockSet.get(3).x = blockSet.get(2).x;
			blockSet.get(3).y = blockSet.get(2).y + 1;
		}
	}

	// ���� Z ��״
	public void ZBlock(int kind, int x, int y) {
		// �����׿�λ��
		blockSet.get(0).x = x;
		blockSet.get(0).y = y;
		if (kind == 1 || kind == 3) {
			blockSet.get(1).x = blockSet.get(0).x;
			blockSet.get(1).y = blockSet.get(0).y + 1;
			blockSet.get(2).x = blockSet.get(1).x + 1;
			blockSet.get(2).y = blockSet.get(1).y;
			blockSet.get(3).x = blockSet.get(2).x;
			blockSet.get(3).y = blockSet.get(2).y + 1;
		} else if (kind == 2 || kind == 4) {
			blockSet.get(1).x = blockSet.get(0).x + 1;
			blockSet.get(1).y = blockSet.get(0).y;
			blockSet.get(2).x = blockSet.get(1).x;
			blockSet.get(2).y = blockSet.get(1).y - 1;
			blockSet.get(3).x = blockSet.get(2).x + 1;
			blockSet.get(3).y = blockSet.get(2).y;
		}
	}

	// ���� S ��״
	public void SBlock(ArrayList<Block> blockSet, int kind, int x, int y) {
		blockSet.get(0).x = x;
		blockSet.get(0).y = y;
		if (kind == 1 || kind == 3) {
			blockSet.get(1).x = blockSet.get(0).x;
			blockSet.get(1).y = blockSet.get(0).y + 1;
			blockSet.get(2).x = blockSet.get(1).x + 1;
			blockSet.get(2).y = blockSet.get(1).y - 2;
			blockSet.get(3).x = blockSet.get(2).x;
			blockSet.get(3).y = blockSet.get(2).y + 1;
		} else if (kind == 2 || kind == 4) {
			blockSet.get(1).x = blockSet.get(0).x + 1;
			blockSet.get(1).y = blockSet.get(0).y;
			blockSet.get(2).x = blockSet.get(1).x;
			blockSet.get(2).y = blockSet.get(1).y + 1;
			blockSet.get(3).x = blockSet.get(2).x + 1;
			blockSet.get(3).y = blockSet.get(2).y;
		}
	}

	// ���� L ��״
	public void LBlock(int kind, int x, int y) {
		blockSet.get(0).x = x;
		blockSet.get(0).y = y;
		if (kind == 1) { // L
			blockSet.get(1).x = blockSet.get(0).x + 1;
			blockSet.get(1).y = blockSet.get(0).y;
			blockSet.get(2).x = blockSet.get(1).x + 1;
			blockSet.get(2).y = blockSet.get(1).y;
			blockSet.get(3).x = blockSet.get(2).x;
			blockSet.get(3).y = blockSet.get(2).y + 1;
		} else if (kind == 2) {
			blockSet.get(1).x = blockSet.get(0).x;
			blockSet.get(1).y = blockSet.get(0).y + 1;
			blockSet.get(2).x = blockSet.get(1).x;
			blockSet.get(2).y = blockSet.get(1).y + 1;
			blockSet.get(3).x = blockSet.get(2).x + 1;
			blockSet.get(3).y = blockSet.get(2).y - 2;
		} else if (kind == 3) {
			blockSet.get(1).x = blockSet.get(0).x;
			blockSet.get(1).y = blockSet.get(0).y + 1;
			blockSet.get(2).x = blockSet.get(1).x + 1;
			blockSet.get(2).y = blockSet.get(1).y;
			blockSet.get(3).x = blockSet.get(2).x + 1;
			blockSet.get(3).y = blockSet.get(2).y;
		} else if (kind == 4) {
			blockSet.get(1).x = blockSet.get(0).x + 1;
			blockSet.get(1).y = blockSet.get(0).y - 2;
			blockSet.get(2).x = blockSet.get(1).x;
			blockSet.get(2).y = blockSet.get(1).y + 1;
			blockSet.get(3).x = blockSet.get(2).x;
			blockSet.get(3).y = blockSet.get(2).y + 1;
		}
	}

	// ���� J ��״
	public void JBlock(int kind, int x, int y) {
		blockSet.get(0).x = x;
		blockSet.get(0).y = y;
		if (kind == 1) {
			blockSet.get(1).x = blockSet.get(0).x + 1;
			blockSet.get(1).y = blockSet.get(0).y;
			blockSet.get(2).x = blockSet.get(1).x + 1;
			blockSet.get(2).y = blockSet.get(1).y;
			blockSet.get(3).x = blockSet.get(2).x;
			blockSet.get(3).y = blockSet.get(2).y - 1;
		} else if (kind == 2) {
			blockSet.get(1).x = blockSet.get(0).x + 1;
			blockSet.get(1).y = blockSet.get(0).y;
			blockSet.get(2).x = blockSet.get(1).x;
			blockSet.get(2).y = blockSet.get(1).y + 1;
			blockSet.get(3).x = blockSet.get(2).x;
			blockSet.get(3).y = blockSet.get(2).y + 1;
		} else if (kind == 3) {
			blockSet.get(1).x = blockSet.get(0).x;
			blockSet.get(1).y = blockSet.get(0).y + 1;
			blockSet.get(2).x = blockSet.get(1).x + 1;
			blockSet.get(2).y = blockSet.get(1).y - 1;
			blockSet.get(3).x = blockSet.get(2).x + 1;
			blockSet.get(3).y = blockSet.get(2).y;
		} else if (kind == 4) {
			blockSet.get(1).x = blockSet.get(0).x;
			blockSet.get(1).y = blockSet.get(0).y + 1;
			blockSet.get(2).x = blockSet.get(1).x;
			blockSet.get(2).y = blockSet.get(1).y + 1;
			blockSet.get(3).x = blockSet.get(2).x + 1;
			blockSet.get(3).y = blockSet.get(2).y;
		}
	}

	// ���� T ��״
	public void TBlock(int kind, int x, int y) {
		blockSet.get(0).x = x;
		blockSet.get(0).y = y;
		if (kind == 1) {
			blockSet.get(1).x = blockSet.get(0).x;
			blockSet.get(1).y = blockSet.get(0).y + 1;
			blockSet.get(2).x = blockSet.get(1).x;
			blockSet.get(2).y = blockSet.get(1).y + 1;
			blockSet.get(3).x = blockSet.get(2).x + 1;
			blockSet.get(3).y = blockSet.get(2).y - 1;
		} else if (kind == 2) {
			blockSet.get(1).x = blockSet.get(0).x + 1;
			blockSet.get(1).y = blockSet.get(0).y - 1;
			blockSet.get(2).x = blockSet.get(1).x;
			blockSet.get(2).y = blockSet.get(1).y + 1;
			blockSet.get(3).x = blockSet.get(2).x + 1;
			blockSet.get(3).y = blockSet.get(2).y;
		} else if (kind == 3) {
			blockSet.get(1).x = blockSet.get(0).x + 1;
			blockSet.get(1).y = blockSet.get(0).y - 1;
			blockSet.get(2).x = blockSet.get(1).x;
			blockSet.get(2).y = blockSet.get(1).y + 1;
			blockSet.get(3).x = blockSet.get(2).x;
			blockSet.get(3).y = blockSet.get(2).y + 1;
		} else if (kind == 4) {
			blockSet.get(1).x = blockSet.get(0).x + 1;
			blockSet.get(1).y = blockSet.get(0).y;
			blockSet.get(2).x = blockSet.get(1).x;
			blockSet.get(2).y = blockSet.get(1).y + 1;
			blockSet.get(3).x = blockSet.get(2).x + 1;
			blockSet.get(3).y = blockSet.get(2).y - 1;
		}
	}

	// ������ɲ�ͬ��״�Ŀ�
	public boolean createRandomBlock(int select, int kind) {

		// System.out.println("select:" + select + " , kind:" + kind);
		int x = 0;
		int y = 0;
		switch (select) {
		case 1: // I
			createBlocks();
			if (kind == 1 || kind == 3) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 3)); // 0-6
			} else if (kind == 2 || kind == 4) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN)); // 0-9
			}
			IBlock(kind, x, y);
			if (createSuccess(blockSet)) {
				return true;
			}
		case 2: // J
			createBlocks();
			if (kind == 1) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 1) + 1); // 1-9
			} else if (kind == 2) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 2)); // 0-7
			} else if (kind == 3) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 1)); // 0-8
			} else if (kind == 4) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 2)); // 0-7
			}
			JBlock(kind, x, y);
			if (createSuccess(blockSet)) {
				return true;
			}
		case 3: // L
			createBlocks();
			if (kind == 1) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 1)); // 0-8
			} else if (kind == 2) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 2)); // 0-7
			} else if (kind == 3) {
				y = (int) (int) (Math.random() * (Setting.MATRIXCOLUMN - 1)); // 0-8
			} else if (kind == 4) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 2) + 2); // 2-9
			}
			LBlock(kind, x, y);
			if (createSuccess(blockSet)) {
				return true;
			}
		case 4: // O
			createBlocks();
			y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 1)); // 0-8
			OBlock(kind, x, y);
			if (createSuccess(blockSet)) {
				return true;
			}
		case 5: // S
			createBlocks();
			if (kind == 1 || kind == 3) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 2) + 1); // 1-8
			} else if (kind == 2 || kind == 4) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 1)); // 0-8
			}
			SBlock(blockSet, kind, x, y);
			if (createSuccess(blockSet)) {
				return true;
			}
		case 6: // T
			createBlocks();
			if (kind == 1) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 2)); // 0-7
			} else if (kind == 2) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 1) + 1); // 1-9
			} else if (kind == 3) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 2) + 1); // 1-8
			} else if (kind == 4) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 1)); // 0-8
			}
			TBlock(kind, x, y);
			if (createSuccess(blockSet)) {
				return true;
			}
		case 7: // Z
			createBlocks();
			if (kind == 1 || kind == 3) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 2)); // 0-7
			} else if (kind == 2 || kind == 4) {
				y = (int) (Math.random() * (Setting.MATRIXCOLUMN - 1) + 1); // 1-9
			}
			ZBlock(kind, x, y);
			if (createSuccess(blockSet)) {
				return true;
			}
		default:
			break;
		}
		return false;
	}

	// �ж��ܷ񴴽��ɹ�
	public boolean createSuccess(ArrayList<Block> block) {
		for (int i = 0; i < block.size(); i++) {
			int x = block.get(i).x;
			int y = block.get(i).y;
			if (outOfBounds(blockSet)) {
				return false;
			}
			if (ShowPanel.matrixData[x][y] != 0) {
				return false;
			}
		}
		return true;
	}

	// �ж�Խ��
	public boolean outOfBounds(ArrayList<Block> block) {
		for (int i = 0; i < block.size(); i++) {
			int x = block.get(i).x;
			int y = block.get(i).y;
			if (x < 0 || x >= Setting.MATRIXROW || y < 0 || y >= Setting.MATRIXCOLUMN) {
				return true;
			}
		}
		return false;
	}

	// ת������
	public boolean transform() {
		// ��ȡ�������׸�������꣬ʹ���Ϊ�¸���̬��������
		int x = blockSet.get(0).x;
		int y = blockSet.get(0).y;

		kind = (kind + 1) % 5;
		if (kind == 0) {
			kind++;
		}
		// ���ԭλ������
		for (int i = 0; i < blockSet.size(); i++) {
			ShowPanel.matrixData[blockSet.get(i).x][blockSet.get(i).y] = 0;
		}
		// ת��ԭ������ÿ���������
		switchs(x, y);

		// �ж��ܷ�ת���ɹ�
		if (createSuccess(blockSet)) {

		} else {
			System.out.println("���ɻ���");
			kind = (kind - 1) % 5;
			if (kind == 0) {
				kind = 4;
			}
			// ��ת������
			switchs(x, y);
			for (int i = 0; i < blockSet.size(); i++) {
				ShowPanel.matrixData[blockSet.get(i).x][blockSet.get(i).y] = 1;
			}
		}
		return false;
	}

	// ת��ԭ������ÿ���������
	public void switchs(int x, int y) {
		switch (select) {
		case 1: // I
			IBlock(kind, x, y);
			break;
		case 2: // J
			JBlock(kind, x, y);
			break;
		case 3: // L
			LBlock(kind, x, y);
			break;
		case 4: // O
			OBlock(kind, x, y);
			break;
		case 5: // S
			SBlock(blockSet, kind, x, y);
			break;
		case 6: // T
			TBlock(kind, x, y);
			break;
		case 7: // Z
			ZBlock(kind, x, y);
			break;
		default:
			break;
		}
	}
	
}
