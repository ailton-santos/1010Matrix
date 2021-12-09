package matriz1010;
import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;

public class matriz1010 
{

	public static void main(String[] args) 
		{
		// TODO Auto-generated method stub

		int[][] matrizpaulo = new int[10][10];
		int som = 0 , li = 0, col = 0; // Declaração de variáveis Soma, Linha e Coluna
		
			Scanner entrada = new Scanner(System.in);
			System.out.println(" Programa Soma Matriz [10]x[10]\n");
				for(li = 0; li < 2; li++) 
					{
					for(col = 0; col < 2; col++)
						{
						System.out.printf("Digite o elemento M[%d][%d]: ", li+1,col+1);
						matrizpaulo[li][col] = entrada.nextInt(); //Alocando o elemento na Matriz
						}
					}

				for(li = 0; li < 2; li++) //Soma primeira coluna
		  		 	{ 
		            som += matrizpaulo[li][1];
		  		 	}
		    System.out.println("\nA Matriz ficou: \n");
		    	for(li = 0; li < 8; li++)
		    	{
		    		for(col = 0; col < 2; col++)
		    			{
		    			System.out.printf("\t %d \t", matrizpaulo[li][col]); 
		    			}
		        System.out.println();
		    	}
		    System.out.println("soma-> "+som); // Resultado Soma
		}
		
}
