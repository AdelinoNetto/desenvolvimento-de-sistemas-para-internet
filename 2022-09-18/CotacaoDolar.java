
import java.util.Locale;
import java.util.Scanner;

public class CotacaoDolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] numeros = {5.12, 4.80, 4.60, 5.20, 3.50, 5.00};
		double maior = numeros[0];
		double menor = numeros[0];
		double lucro = 0.0;
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			} 
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		System.out.println("Melhor valor pra compra: U$" + menor);
		System.out.println("Melhor valor pra venda: U$" + maior);
		lucro = (maior - menor);
		System.out.printf("Lucro de: U$%.2f.", lucro);
		
		
		sc.close();
	}

}
