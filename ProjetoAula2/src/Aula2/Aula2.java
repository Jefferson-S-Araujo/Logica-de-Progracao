package Aula2;

import java.util.Scanner;

public class Aula2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String grupo[] = new String[5];
		int i;
		for (i = 0; i < 5; i++) {
			System.out.printf("Grupo da mesa %d: ", i + 1);
			grupo[i] = scan.next();
		}
		System.out.println();
		for (i = 0; i < 5; i++)
			if ((i + 1) % 2 == 0) {
				System.out.printf("A mesa %d foi pre-miada ", i + 1);
				System.out.printf("grupo do Sr(a) ");
				System.out.printf(grupo[i]);
				System.out.println();
			}
	}

}