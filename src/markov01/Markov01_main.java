package markov01;

import java.util.Scanner;

public class Markov01_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//P(i,i+1) = p
		System.out.print("Input p > ");
		double p = Double.parseDouble(scan.next());
		
		//t : Simulation Period
		System.out.print("Input t > ");
		int t = Integer.parseInt(scan.next());

	}

}
