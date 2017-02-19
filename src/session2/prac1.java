        /* print x pattern */
package session2;
		//importing scanner class 
import java.util.Scanner;

public class prac1 {

	public static void main(String[] args) {
		
		int i, j, size;
		//initializing the size of X pattern you want
		System.out.println("enter the size of pattern you want to print");
		Scanner obj = new Scanner(System.in);
		//taking input
		size = obj.nextInt();
		for (j = 1; j <= size; j++) {
			for (i = 1; i <= size; i++) {
				if (i == j || i == (size + 1) - j)

					System.out.print('x');
				else
					System.out.print(" ");
			}
			System.out.println();
			//close input from scanner 
		}obj.close();

	}

}
