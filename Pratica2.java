package lpa;

import java.util.Scanner;

public class Pratica2 {

	public static void main(String[] args) {
		double a; 
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um valor: ");
		a = ler.nextDouble();
		
		String mensagem = a % 5 == 0 ? " muiltiplo de 5" : "nao é multiplo de 5";
		System.out.println(mensagem);
	}
	

}
