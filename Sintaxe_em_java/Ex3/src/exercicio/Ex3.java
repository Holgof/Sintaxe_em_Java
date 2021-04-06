package exercicio;

public class Ex3 {
	public static void main(String[] args)
	{
		int i, soma = 0;
		for (i = 0; i < 1000; i++) {
			soma += i;
		}
		System.out.println("A soma de todos os inteiros no intervalo fechado entre 1 e 999 é igual a " + soma);
	}
}
