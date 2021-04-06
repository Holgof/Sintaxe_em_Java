package exercicio;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("Insira 3 valores reais para as variaveis R, S e T respectivamente:");
		Scanner input = new Scanner(System.in);
		float R, S, T, maior;							//declaração dos valores reais
			
		R = input.nextFloat();
		maior = R;
					
		S = input.nextFloat();
		if(S > maior) {
			maior = S;
		}
			
		T  = input.nextFloat();
		if(T > maior) {
			maior = T;
		}
			
		System.out.println("O maior dos valores apresentados é " + maior);	//output
		input.close();
	};
}