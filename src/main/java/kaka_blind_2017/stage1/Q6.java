package kaka_blind_2017.stage1;

/**
 * [1차] 프렌즈4블록
 */
public class Q6 {
	class FriendBlock {
		int x;
		int y;
		char data;
		boolean isRemove;

		public FriendBlock(int m, int n, char friend) {
			this.x = m;
			this.y = n;
			this.data = friend;
			this.isRemove = false;
		}
	}

	public static void main(String args[]) {

	}

	public int solution(int m, int n, String[] board) {
		int solution = 0;

		FriendBlock[][] friendBoard = getFriendBlock(m, n, board);
		while (true) {
			int removeCount = getRemoveCount(m, n, friendBoard);
			if (removeCount == 0) {
				break;
			}
			solution += removeCount;
		}
		return solution;
	}

	private FriendBlock[][] getFriendBlock(int m, int n, String[] board) {
		FriendBlock[][] friendBlocks = new FriendBlock[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				char friend = board[i].charAt(j);
				FriendBlock friendBlock = new FriendBlock(i, j, friend);
				friendBlocks[i][j] = friendBlock;
			}
		}
		return friendBlocks;
	}

	private int getRemoveCount(int m, int n, FriendBlock[][] friendBoard) {
		boolean[][] remove = new boolean[m][n];
		int removeCount = 0;

		// 전체를 확인하며 삭제해야할곳(4개 짜리) 표시
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				FriendBlock friendBlock = friendBoard[i][j];

				// 삭제한곳 패스
				if (friendBlock.data == 'x') {
					continue;
				}

				// 인접한곳(우, 하) 확인
				if (friendBlock.x + 1 > m - 1 || friendBlock.y + 1 > n - 1) {
					continue;
				}

				// 4개짜리 삭제할곳(4개짜리)으로 표시
				if (friendBlock.data == friendBoard[friendBlock.x + 1][friendBlock.y].data
						&& friendBlock.data == friendBoard[friendBlock.x][friendBlock.y + 1].data
						&& friendBlock.data == friendBoard[friendBlock.x + 1][friendBlock.y + 1].data) {
					remove[friendBlock.x][friendBlock.y] = true;
					remove[friendBlock.x][friendBlock.y + 1] = true;
					remove[friendBlock.x + 1][friendBlock.y] = true;
					remove[friendBlock.x + 1][friendBlock.y + 1] = true;
				}
			}
		}

		// 4개짜리 삭제
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				FriendBlock friendBlock = friendBoard[i][j];
				if (remove[friendBlock.x][friendBlock.y]) {
					friendBlock.data = 'x'; // 삭제된 데이터는 0으로 표시
					removeCount++; // 삭제한 블락 갯수 증가
				}
			}
		}

		// 블록 재정비
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				FriendBlock friendBlock = friendBoard[i][j];
				if (friendBlock.data != 'x') {
					continue;
				}

				// 위 프렌드 블락에서 'x' 가 아닌 프렌드 찾기
				if (friendBlock.x - 1 < 0) {
					continue;
				}

				FriendBlock friendBlockUp = friendBoard[friendBlock.x - 1][friendBlock.y];
				swapBlock(friendBlock, friendBlockUp, remove);
			}
		}
		return removeCount;
	}

	private void swapBlock(FriendBlock friendBlock, FriendBlock friendBlockUp, boolean[][] remove) {
		char temp = friendBlock.data;
		friendBlock.data = friendBlockUp.data;
		friendBlockUp.data = temp;

		boolean temp2 = remove[friendBlock.x][friendBlock.y];
		remove[friendBlock.x][friendBlock.y] = remove[friendBlock.x - 1][friendBlock.y];
		remove[friendBlock.x - 1][friendBlock.y] = temp2;
	}
}
