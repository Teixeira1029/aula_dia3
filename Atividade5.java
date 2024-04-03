package lpa;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade= 18;
		
		System.out.print("Qual sua idade? ");
		idade = ler.nextInt();
		String mensagem = idade >=18 ? "Maior de idade" : "Menor de idade";
		System.out.println(mensagem); // "Imprime maior de idade"

	}

}
