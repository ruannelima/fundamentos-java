
public class Main {

	public static void main(String[]args) {

		int numero01; 
		int numero02;
		
		numero01 = 20;
		numero02 = 6;
		
		boolean maior = numero01 > numero02;
		boolean menor = numero01 < numero02;
		boolean maiorOuIgual = numero01 >= numero02;
		boolean menorOuIgual = numero01 <= numero02;
		boolean igual = numero01 == numero02;
		boolean diferente = numero01 != numero02;
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Maior ou igual: " + maiorOuIgual);
		System.out.println("Menor ou igual: " + menorOuIgual);
		System.out.println("Igual: " + igual);
		System.out.println("Diferente: " + diferente);
		
		
 }
}
