package lpa;
import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		System.out.println("Informe o dia da semana: ");
		
		 int dia;
		 dia= ler.nextInt();
		 
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda");
			break;
			
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		case 7:
			System.out.println("sábado");
			break;
			
		default:
			System.out.println("Dia invalido");
			
			
			
			
		}

	}

}
