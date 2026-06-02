package metodosaula2;

import java.util.Scanner;

public class MetodosAula2 {

	public static void main(String[] args) {
		/*
		 * Métodos e parâmetros em java, exercício da aula 2.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("*********************************PARAMENTROS_JAVARU*********************************");
		int operacao, num1, num2;

		System.out.println("Digite dois números: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Qual operação você quer fazer? (Digite 1 para SOMA ou número 2 para subtração): ");
		operacao = scan.nextInt();

		switch (operacao) {
		case 1:
			soma(num1, num2);
			break;
		case 2:
			subtracao(num1, num2);
			break;
		default:
			System.out.println("Operação inválida");
			break;
		}

	}

	public static void subtracao(int a, int b) {
		int subtracao = a - b;

		System.out.print("Resultado: " + subtracao);

	}

	public static void soma(int a, int b) {
		int soma;
		soma = a + b;
		System.out.print("Resultado: " + soma);

	}
}