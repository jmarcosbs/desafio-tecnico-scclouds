package desafios;

import java.util.Scanner;

public class DesafioFibonacci {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número maior ou igual a zero:");
		
		int N;
		
		boolean correctInput = false;
		
		do {
			
				try {
					
					N = input.nextInt();
				
					if (N >= 0) {
						 
						correctInput = true;
						
						// Executing the Recursive function
						System.out.println(fbRecursive(N));
						
						// Executing the linear function
						//System.out.println(fbLinear(N));
						
					} else {
						
						System.out.println("Valor inválido. Digite um número inteiro maior ou igual a zero: ");
						input.nextLine(); // Clear buffer
						
					}
				
			} catch (java.util.InputMismatchException e) {
				
				System.out.println("Valor inválido. Digite um número inteiro maior ou igual a zero: ");
				input.nextLine(); // Clear buffer
				
			} 
				
		} while (correctInput == false);
		
		input.close();
	}
	
	public static int fbRecursive(int N) {
		
		/*
		  * Recursive function that receive a integer and positive number and shows its respective value in Fibonacci Sequence.
		   
		  * Working sample :  f(3) = f(3 - 1) + f (3 - 2)
		   					
		   					= f(2) = 1 + 0
		   					+ f(1) = 1	
		   					= 1 + 0 + 1 = 2
		*/
		
		if(N <= 1) {
			
			return N;
			
		} else {

			return fbRecursive(N-1) + fbRecursive(N-2);
			
		}
		
		
	}
	
	public static int fbLinear(int N) {
		
		/*
		  * Linear function that receive a integer and positive number and shows its respective value in Fibonacci Sequence.
		  * Simulate the Fibonacci Sequence formation, where the next number is the sum of two previous numbers
		*/
		
		int previous1 = 0;
		int previous2 = 1;
		int fb = 1;
		
		if (N > 0) {
			
			for (int i = 2; i < N; i++) { // The count starts at fb = 1, then position 0 (with if (N > 0)) and position 1 was resolved
				
				previous1 = previous2;
				previous2 = fb;
				
				fb = previous1 + previous2;
				
			}
			
			return fb;
			
		} else {
			
			return 0;
			
		}
		
		
	}

}
