package exercicio;
import java.util.Scanner;

public class Ex5 {						//Classe que recebe um inteiro para teste
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe qual inteiro deseja calcular a fatorial");
		int n = input.nextInt();
		input.close();		//Fechando o scanner
		
		int fatorial = new calculaFatorial().fatorial(n);	//chamando a classe do enunciado
		
		if (fatorial == -1) {
			System.out.println("Esta entrada não possui fatorial");
			System.exit(-1);
		}
		
		System.out.println("O fatorial de " + n + " é " + fatorial);
	}
}

class calculaFatorial{		//Classe que recebe um inteiro e obedece a descrição do enunciado
	protected int fatorial(int n) {
		int fatorial = 1;
		if (n < 0) {
			return(-1);
		}
		
		if (n == 1 || n == 0) {
			return(1);
		}
		while (n > 1) {
			fatorial = fatorial * n;
			n -= 1;
		}
		return fatorial;
	}
}