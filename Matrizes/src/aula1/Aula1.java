package aula1;

public class Aula1 {

	public static void main(String[] args) {

		// Primeiro colchete da matriz é a linha e o segundo a coluna

		int matriz[][] = new int[3][2];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = ((i + j) * 4) + 12;
				System.out.print(matriz[i][j] + "\t");

			}
			System.out.println();
		/*}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				if (i == j) {

					System.out.println("Posição[" + i + "][" + j + "]=" + matriz[i][j]);
				}
			}*/
		}

	}
}
