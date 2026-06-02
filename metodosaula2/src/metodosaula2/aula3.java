package metodosaula2;

import java.util.Scanner;

public class aula3 {

	public static void main(String[] args) {
		int a, b, s = 0;
		char op;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite dois números: ");
		a = scan.nextInt();
		op = scan.next().charAt(0);
		b = scan.nextInt();

		switch (op) {
		case '+':
			s = soma(a, b);
			break;
		case '-':
			s = subtracao(a, b);
			break;
		case '*':
			s = multiplicacao(a, b);
			break;
		case '/':
			s = divisao(a, b);
			break;
		}
		System.out.println(s);

		scan.close();
	}

	public static int soma(int num1, int num2) {
		int c;
		c = num1 + num2;

		return c;
	}

	public static int subtracao(int numa, int numb) {
		int c;
		c = numa - numb;
		return c;
	}

	public static int divisao(int numa, int numb) {
		int c;
		c = numa / numb;
		return c;

	}

	public static int multiplicacao(int numa, int numb) {
		int c;
		c = numa * numb;
		return c;
	}

}