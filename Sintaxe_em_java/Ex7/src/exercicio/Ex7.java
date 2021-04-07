package exercicio;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		float avaliacao, total, pessimas, ruins, boas, otimas;
		avaliacao = total = pessimas = ruins = boas = otimas = 0;
		float percentPessimo, percentRuim, percentBom, percentOtimo;
		String proximaAvaliacao = "";
		Scanner input = new Scanner(System.in);
		
		do {																						//recebendo e classificando as avaliações
			System.out.println("Insira a avaliação do serviço com um inteiro entre 0 e 100:");
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
																	
			do {
				System.out.println("Deseja adicionar outra avaliação? Responda com 'sim' para iniciar a próxima avaliação e 'não' para visualizar o resultado da pesquisa");
				proximaAvaliacao = input.nextLine();
				} while (proximaAvaliacao.equals("sim") == false && proximaAvaliacao.equals("não") == false);
			
			} while (proximaAvaliacao.equals("sim") == true);
		
		input.close();
		
		percentPessimo = pessimas/total*100;
		percentRuim = ruins/total*100;
		percentBom = boas/total*100;
		percentOtimo = otimas/total*100;
				
		System.out.printf("%.2f%% dos funcionarious avaliou o serviço como péssimo.%n", percentPessimo);
		System.out.printf("%.2f%% dos funcionarious avaliou o serviço como ruim.%n", percentRuim);
		System.out.printf("%.2f%% dos funcionarious avaliou o serviço como bom.%n", percentBom);
		System.out.printf("%.2f%% dos funcionarious avaliou o serviço como ótimo.%n", percentOtimo);
		
	}
}
