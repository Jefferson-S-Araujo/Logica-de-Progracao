package metodosaula2;

import java.util.Scanner;

//Alunos: Jefferson Araujo e João Neto

public class reservaEmergencia {

	public static void main(String[] args) {
		int idade;

		Scanner scan = new Scanner(System.in);

		System.out.println("                         ELEIÇÕES UCSAL ADS1T1 2026");

		System.out.print("Informe sua idade: ");
		idade = scan.nextInt();
		
	if (idade >= 0 && idade <= 15) {
		System.out.println(semPermiss());
	}
		else if (idade >=16 && idade <= 17 || idade>=65) {
			System.out.println(facult());
		}else if (idade >= 18 && idade <=64) {
				System.out.println(votOb());
			}else {
				System.out.println("Idade inválida");}
			}
		

	public static String semPermiss() {

		return "Resultado: Sem permissão para votar";

	}

	public static String facult() {
		return "Resultado: Voto facultativo!";
	}

	public static String votOb() {

		return "Voto obrigatório!!!";

	}

}
