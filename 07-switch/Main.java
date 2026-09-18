
public class Main {

	public static void main(String[] args) {
		int opcao;
		opcao = 3;
		
		switch (opcao) {
	    case 1:
	    	System.out.println("Cadastrar");
	        break;

	    case 2:
	    	System.out.println("Consultar");
	        break;
	        
	    case 3:
	    	System.out.println("Sair");
	    	break;

	    default:
	    	System.out.println("Opção inválida");
		}
	}
}
