package exercicio;
import java.util.Scanner;

public class Ex1{

    public static void main(String[] args){

        System.out.println("Insira quandos inteiros deseja avaliar: \n");
        int numeroDeInteiros;
        int i = 0;
        
        Scanner receptor = new Scanner(System.in);
        numeroDeInteiros = receptor.nextInt();     //fim de declara��o de variaveis e input do usu�rio

        System.out.println("Agora insira os inteiros que deseja avaliar:");
        int[] arrayDeInteiros;
        arrayDeInteiros = new int[numeroDeInteiros];
        for(i = 0; i < numeroDeInteiros; i++){
            arrayDeInteiros[i] = receptor.nextInt();    //fim da montagem do array
        }
        
        receptor.close();						   //fechando o scanner
        System.out.println("Os seguintes valores s�o negativos: (Caso n�o haja valores negativos a sa�da estar� em branco):");
        for(i = 0; i < numeroDeInteiros; i++){
            if(arrayDeInteiros[i] < 0){
                System.out.println(arrayDeInteiros[i]); //output: print dos inteiros negativos
            }
        }
    }
}