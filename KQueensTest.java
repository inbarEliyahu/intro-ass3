
public class KQueensTest {
	public static void main(String[] args){
		int rows = 5;
		int cols = 6;
		int[][] walls = {{1},{1},{2,3,4},{},{}};
		
		int[][] board4k = KQueens.kQueens(4, rows, cols, walls);
		KQueens.printBoard(board4k);
		System.out.println(KQueens.isLegalSolution(board4k, 4, rows, cols, walls)); // true

		int[][] board5k = KQueens.kQueens(5, rows, cols, walls);
		KQueens.printBoard(board5k);
		System.out.println(KQueens.isLegalSolution(board5k, 5, rows, cols, walls)); // true

		int[][] board6k = KQueens.kQueens(6, rows, cols, walls);
		KQueens.printBoard(board6k);
		System.out.println(KQueens.isLegalSolution(board6k, 6, rows, cols, walls)); // true

		int[][] board7k = KQueens.kQueens(7, rows, cols, walls);
		KQueens.printBoard(board7k); // "There is not solution"

		// You can add more tests here...
	}
}
