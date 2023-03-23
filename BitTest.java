
public class BitTest {
	public static void main(String[] args){
		Bit A = new Bit(true);
		System.out.println(A.isOne()); // true

		Bit B = new Bit(false);
		System.out.println(B.lessThan(A)); // true

		Bit Cin = new Bit(false);
		System.out.println(Cin.lessEq(B)); // true
		
		System.out.println(Bit.fullAdderSum(A, B, Cin)); // 1
		System.out.println(Bit.fullAdderCarry(A, B, Cin)); // 0

		// You can add more tests here...

	}
}
