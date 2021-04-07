package exercicio;
import java.util.Scanner; 

public class Ex8 {
	public static void main(String[] args) {
		int ordem, i = 0, j = 0;
		int[][] matriz;
		boolean perfeicao;
		
		System.out.println("Insira a ordem da matriz:");
		Scanner input = new Scanner(System.in);
		
		ordem = input.nextInt();
		
		matriz = new MontaMatriz().preencheMatriz(ordem);
		
		input.close();
		
		perfeicao = new AvaliaMatriz().quadradoPerfeito(matriz, ordem);
		
		
		if (perfeicao == true) {
			System.out.println("A matriz introduzida é um quadrado perfeito.");
		}
		else {
			System.out.println("A matriz introduzida não é um quadrado perfeito");
		}
		
	}
}

class MontaMatriz {
	protected int[][] preencheMatriz(int ordem) {
		int i = 0;
		int j = 0;
		int[][] matriz = new int[ordem][ordem];
		Scanner scanner = new Scanner(System.in);
		
		for (i = 0; i < ordem; i++)
		{
			for (j = 0; j < ordem; j++)
			{
				System.out.println("Insira o valor para a posição [" + i + "][" + j + "].");
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		return matriz;
	}
}

class AvaliaMatriz {
	protected boolean quadradoPerfeito (int[][] matriz, int ordem) {	
		int i = 0, j = 0;
		int resultadoParcial1 = 0, resultadoParcial2 = 0, resultadoParcial3 = 0;
		
		while (j < ordem) {
			for (i = 0; i < ordem; i++) {
			
				resultadoParcial1 += matriz[i][j];
				resultadoParcial2 += matriz[j][i];
			}
			
			if (resultadoParcial1 != resultadoParcial2){
				System.out.println("asdad");
				return(false);
			}
			
			if (j == 0) {
				resultadoParcial3 = resultadoParcial1;
			}
			
			if (resultadoParcial1 != resultadoParcial3) {
				return(false);
			}
			j++;
			resultadoParcial1 = 0;
			resultadoParcial2 = 0;
		}	
		
		for (i = 0; i < ordem; i++) {
			resultadoParcial1 +=  matriz[i][i];
			resultadoParcial2 += matriz[ordem - (i + 1)][i];
		}
		
		if (resultadoParcial1 == resultadoParcial2 && resultadoParcial2 == resultadoParcial3) {
			return true;
		}
		else {
			return false;
		}
	}
}
