
public class IsLegalSolutionTest {
	public static void main(String[] args){
		
		int[][] board = {{KQueens.QUEEN, KQueens.EMPTY, KQueens.EMPTY},
						 {KQueens.EMPTY, KQueens.EMPTY, KQueens.EMPTY},
						 {KQueens.EMPTY, KQueens.EMPTY, KQueens.QUEEN}};
		int [][] wallsTest1 = {{},{},{}};
		int k = 2;
		int rows = 3;
		int cols = 3;

		KQueens.printBoard(board);
		System.out.println(KQueens.isLegalSolution(board, k, rows, cols, wallsTest1)); // false
		
		int[][] wallsTest2 = {{}, {1}, {}};
		board[1][1] = KQueens.WALL;
		KQueens.printBoard(board);
		System.out.println(KQueens.isLegalSolution(board, k, rows, cols, wallsTest2)); // true
		
		// You can add more tests here...

	}
}
