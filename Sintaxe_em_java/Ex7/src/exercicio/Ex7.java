package exercicio;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		int avaliacao, total, pessimas, ruins, boas, otimas;
		avaliacao = total = pessimas = ruins = boas = otimas = 0;
		float percentPessimo, percentRuim, percentBom, percentOtimo;
		Scanner input = new Scanner(System.in);
		String proximaAvaliacao = "sim";
		
		do {																						//recebendo e classificando as avalia��es
			System.out.println("Insira a avalia��o do servi�o com um inteiro entre 0 e 100:");
			avaliacao = input.nextInt();
			
			if (avaliacao >= 0 && avaliacao <= 25) {
				pessimas ++;
				total ++;
			}
			else if (avaliacao > 25 && avaliacao <= 50) {
				ruins ++;
				total++;
			}
			else if (avaliacao > 50 && avaliacao <= 75) {
				boas++;
				total++;
			}
			else if (avaliacao > 75 && avaliacao <= 100) {
				otimas++;
				total++;
			}
			
			else {
				System.out.println("Entrada Invalida");											   //tratamento de erro
				continue;
			}
																	
			System.out.println("Deseja adicionar outra avalia��o? Responda com 'sim' para iniciar a pr�xima avalia��o e qualquer outra palavra para terminar o programa e visualizar os resultados.");  //perguntando ao usuario se deseja adicioar outra avalia��o com controle de erro
			proximaAvaliacao = input.nextLine();			
				
			} while (proximaAvaliacao == "sim");
		
		input.close();
		
		percentPessimo = pessimas/total*100;
		percentRuim = ruins/total*100;
		percentBom = boas/total*100;
		percentOtimo = otimas/total*100;
				
		System.out.println(percentPessimo + "% dos funcionarious avaliou o servi�o como p�ssimo.");
		System.out.println(percentRuim + "% dos funcionarious avaliou o servi�o como ruim.");
		System.out.println(percentBom + "% dos funcionarious avaliou o servi�o como bom.");
		System.out.println(percentOtimo + "% dos funcionarious avaliou o servi�o como �timo.");
		
	}
}