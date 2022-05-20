package Basic;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//unary operators
		System.out.println("unary operators");
		int x = 10;
		System.out.println(x++); // 10 (11)
		System.out.println(x);
		System.out.println(++x); // 12
		System.out.println(x--); //12 (11)
		System.out.println(x);
		System.out.println(--x);
		// arthematic
		System.out.println("Arthematic operators");
		int a = 10;
		int b = 12;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("binary operators");
		System.out.println("left shift operators");
		System.out.println(10<<2); // 10*2pow2 ==== 10* 4
		System.out.println(10<<3); // 10 * 8
		System.out.println("right shift operators");
		System.out.println(10>>2); // 10/2pow2 ==== 2
		System.out.println(10>>3); //10/ 2pow3 ==== 1
		System.out.println("Assignment operators");
		int num1 = 10;
		System.out.println(num1);
		num1+=3; // 10+ 3 == 13
		System.out.println(num1);
		num1-=3; // 13-3 === 10
		System.out.println(num1);
		num1*=2; // 10 *2 === 20
		System.out.println(num1);
		num1/=2; // 20/2 === 10
		System.out.println(num1);
		System.out.println("comparision operators");
		int y = 5;
		int z = 4;
		System.out.println(y == z);
		System.out.println(y != z);
		System.out.println(y > z);
		System.out.println(y < z);
		System.out.println(y >= z);
		System.out.println(y <= z);
		System.out.println("logical operators");
		int c = 50;
		System.out.println(c > 40 && c < 60);
		System.out.println(c > 40 || c < 60);
		System.out.println(!(c > 40 || c < 60));
		System.out.println("terinary operators");
		int a1 = 5;
		int b1 = 4;
		boolean min = (a1<b1)?true:false;
		int min1 = (a1<b1)?a1:b1;
		System.out.println(min);
		System.out.println(min1);
	}

}
