package desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DesafioNumerosPrimos {

	private static List<Integer> primesLista = new ArrayList<Integer>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número maior que 1:");

		int N;

		boolean correctInput = false;

		do {

			try {

				N = input.nextInt();

				if (N > 1) {

					correctInput = true;

					// Executing the recursive function
					System.out.println(getPrimeNumbersRecursive(N).toString());

					// Executing the linear function
					// System.out.println(getPrimeNumbersLinear(N).toString());

				} else {

					System.out.println("Valor inválido. Digite um número inteiro maior do que 1:");

					input.nextLine(); // Clear buffer
				}

			} catch (java.util.InputMismatchException e) {

				System.out.println("Valor inválido. Digite um número inteiro maior do que 1:");

				input.nextLine(); // Clear buffer

			}

		} while (correctInput == false);

		input.close();

	}

	public static List<Integer> getPrimeNumbersLinear(int N) {

		/*
		 * Linear function that receive a integer and greater than 1 and shows a list of Prime Numbers from 2.
		 * Count the number of divisions, if the result equals 0 the number is divisible only by one and itself indicating it is a prime number.
		*/

		List<Integer> primesList = new ArrayList<Integer>();

		for (int i = 2; i <= N; i++) { // Prime number is greater than one

			int countDivisions = 0;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					countDivisions++;
				}

			}

			if (countDivisions == 0) { // If divisions equal 0, it means that the number is only divisible by one and itself.

				primesList.add(i);

			}

		}

		return primesList;

	}

	public static List<Integer> getPrimeNumbersRecursive(int N) {

		/*
		 * Recursive function that receive a integer and greater than 1 and shows a list of Prime Numbers from 2.
		 * Analyze all numbers up to N greater than 1 subtracting 1 from N each time.
		 * The function stops when N is greater than one.
		 * Count the number of divisions, if the result equals 0 the number is divisible only by one and itself indicating it is a prime number.
		*/

		if (N > 1) {
			int countDivisions = 0;

			for (int i = 2; i < N; i++) {

				if (N % i == 0) {
					countDivisions++;
				}

			}

			if (countDivisions == 0) { // If divisions equal 0, it means that the number is only divisible by one and itself.

				primesLista.add(N);

			}

			return getPrimeNumbersRecursive(N - 1);

		} else {

			Collections.sort(primesLista); // Sort the list to ascending values

			return primesLista;

		}

	}

}
