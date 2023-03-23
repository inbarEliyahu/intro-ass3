
public class AddQueenTest {
	public static void main(String[] args){
			int[][] board = {{KQueens.EMPTY, KQueens.EMPTY, KQueens.EMPTY},
							 {KQueens.EMPTY, KQueens.EMPTY, KQueens.QUEEN}};
			
			
			System.out.println(board[0][0] == KQueens.QUEEN); // false
			System.out.println(KQueens.addQueen(board, 0, 0)); // true
			System.out.println(board[0][0] == KQueens.QUEEN); // true
			
			System.out.println(KQueens.addQueen(board, 0, 1)); // false
			
			// You can add more tests here...
	}
}
