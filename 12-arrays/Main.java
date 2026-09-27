import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		int soma = 0;
		
		int maior = 0;
		
		for(int i=0;i<5;i++) {
		System.out.println("Digite um numero:");
		numeros[i] = teclado.nextInt();
		soma = soma + numeros[i];
		
		if (i == 0) {
		    maior = numeros[i];
		}
		
		if (numeros[i] > maior) {
		    maior = numeros[i];
		}   
	    }
		
		
		for(int i=0;i<5;i++) {
		System.out.println(numeros[i]);
		}
		
		System.out.println("A soma dos números é: " + soma);
		System.out.println("O maior número é: " + maior);
		
	}
}
