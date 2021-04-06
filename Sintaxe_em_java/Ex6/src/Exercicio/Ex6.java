package Exercicio;

public class Ex6 {
	public static void main(String[] args) {
			
		int anterior2 = 0;
		int anterior1 = 1;
		int atual = 1;
	
		System.out.println("Os números pertencentes à sequência de Fibonacci que são menores que 100 são:");
		System.out.println(anterior2);
		System.out.println(anterior1);
	
		while (atual < 100) {
			
			System.out.println(atual);
		
			anterior2 = anterior1;
			anterior1 = atual;
			atual = anterior2 + anterior1;
		}
	}
}