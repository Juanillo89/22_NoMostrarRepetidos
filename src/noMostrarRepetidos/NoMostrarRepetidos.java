package noMostrarRepetidos;

import java.util.Scanner;

public class NoMostrarRepetidos
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[8];
		boolean repetido;
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i < numeros.length; i++)
		{
			repetido = false;
			// Buscamos numeros[i] en el resto del array
			for(int j = 0; j < numeros.length && !repetido; j++)
			{
				if(numeros[i] == numeros[j] && i != j)
				{
					repetido = true;
				}
			}
			if(!repetido)
			{
				System.out.println(numeros[i]);
			}
		}		
	}
}

