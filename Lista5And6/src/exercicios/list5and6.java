package exercicios;

import java.util.Scanner;

public class list5and6 {

	public static void main(String[] args) {
		int nota;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma nota");
		nota = scan.nextInt();
		
		if (nota>=0 && nota <=10){
			System.out.println("Nota válida: "+nota);
		}else {
			if(nota<0 || nota>10) {
				System.out.println("Número inválido!!");
			}
		}
		
		

	}

}
