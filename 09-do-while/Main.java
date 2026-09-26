import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int op = 0;
		Scanner teclado = new Scanner (System.in);
				
		do {
			
			System.out.println("-------------------");
			System.out.println("MENU PRINCIPAL");
			System.out.println("-------------------");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar");
			System.out.println("3 - Sair");
			
			System.out.println("Escolha uma opção: ");
			op = teclado.nextInt();
			
			switch (op) {
			case 1: 
				System.out.println("1 - Cadastrar");
			break;
			
			case 2: 
				System.out.println("2 - Consultar");
			break;
			
			case 3: 
				System.out.println("3 - Encerrando programa...");
			break;
			
			default: 
				System.out.println("Opção inválida");
			}
		} while(op!=3);
	}
}
