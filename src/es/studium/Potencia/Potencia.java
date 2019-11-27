package es.studium.Potencia;

import java.util.Scanner;

public class Potencia
{
	public static void main(String[] args)
	{
		int base, exp, resultado, i;
		// Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		resultado = 1;
		System.out.println("Dame un número para la base:");
		base = teclado.nextInt();
		System.out.println("Dame un número para el exponente:");
		exp = teclado.nextInt();
		for(i=1; i<=exp; i++)
		{
			resultado = resultado * base;
		}
		System.out.println("El valor de elevar " + base + " a " + exp + " da como resultado " + resultado);
		teclado.close();
	}
}