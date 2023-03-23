
public class IsQueenThreatenedTest {
	public static void main(String[] args){

		int[][] board = {{KQueens.QUEEN, KQueens.WALL, KQueens.EMPTY, KQueens.QUEEN},
						 {KQueens.WALL, KQueens.WALL, KQueens.EMPTY, KQueens.EMPTY},
						 {KQueens.EMPTY, KQueens.EMPTY, KQueens.EMPTY, KQueens.EMPTY},
						 {KQueens.QUEEN, KQueens.EMPTY, KQueens.EMPTY, KQueens.EMPTY}};
		
		KQueens.printBoard(board);
		System.out.println(KQueens.isQueenThreatened(board, 0, 0)); // false
		System.out.println(KQueens.isQueenThreatened(board, 0, 3)); // true
		System.out.println(KQueens.isQueenThreatened(board, 3, 0)); // true
		
		// You can add more tests here...
	}
}
