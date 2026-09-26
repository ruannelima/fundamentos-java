import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		String nome;
		
		System.out.println("Digite seu nome:");
		nome = teclado.nextLine();
		
		int quant = nome.length();
		String mai = nome.toUpperCase(); 
		String min = nome.toLowerCase();
		
		System.out.println("Olá, " + nome + "!");
		System.out.println("Seu nome possui " + quant + " caracteres.");
		System.out.println("Nome em maiusculo: " + mai + ".");
		System.out.println("Nome em minusculo: " + min + ".");
	}
}

