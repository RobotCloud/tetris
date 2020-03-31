package tetris;

import java.util.ArrayList;

/**
 * 
 * @描述：创建块
 *
 */
public class CreateBlocks {

	// 存储四个块的列表
	static ArrayList<Block> blockSet = new ArrayList<Block>();

	/**
	 * 决定是哪个形状的块
	 */
	static int select;
	/**
	 * 决定块的方向
	 */
	static int kind;

	// 创建基本的四个块
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

	// 构建 I 形状
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

	// 构建 O 形状
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

	// 构建 Z 形状
	public void ZBlock(int kind, int x, int y) {
		// 设置首块位置
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

	// 构建 S 形状
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

	// 构建 L 形状
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

	// 构建 J 形状
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

	// 构建 T 形状
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

	// 随机生成不同形状的块
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

	// 判断能否创建成功
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

	// 判断越界
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

	// 转换方向
	public boolean transform() {
		// 获取集合中首个块的坐标，使其成为下个形态的首坐标
		int x = blockSet.get(0).x;
		int y = blockSet.get(0).y;

		kind = (kind + 1) % 5;
		if (kind == 0) {
			kind++;
		}
		// 清除原位置数据
		for (int i = 0; i < blockSet.size(); i++) {
			ShowPanel.matrixData[blockSet.get(i).x][blockSet.get(i).y] = 0;
		}
		// 转换原集合中每个块的坐标
		switchs(x, y);

		// 判断能否转换成功
		if (createSuccess(blockSet)) {

		} else {
			System.out.println("不可换换");
			kind = (kind - 1) % 5;
			if (kind == 0) {
				kind = 4;
			}
			// 再转换回来
			switchs(x, y);
			for (int i = 0; i < blockSet.size(); i++) {
				ShowPanel.matrixData[blockSet.get(i).x][blockSet.get(i).y] = 1;
			}
		}
		return false;
	}

	// 转换原集合中每个块的坐标
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
