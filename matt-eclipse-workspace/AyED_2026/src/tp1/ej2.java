package tp1;

import java.util.Scanner;

public class ej2 {

	public static int [] nPrimerosMultiplosEnterosDe(int n) {
		int [] res = new int [n];
		
		for (int i = 1; i<= n; i++) {
			res[i-1] = n*i;
		}
		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		int input = sc.nextInt();
		
		while (input != 0) {
			int [] res = nPrimerosMultiplosEnterosDe(input);
			for (int n: res) 
				System.out.print(n + " ");
			input = sc.nextInt();
		}
	}

}
