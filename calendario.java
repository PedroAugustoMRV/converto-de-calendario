import java.util.Scanner;

//instrução1
//instrução2
//instrução3
//instrução4
//instrução5
//..

class calendari 
{
	
	public static void judeu(int ano)
	{
		int conta;
		conta = ano + 3760;
		System.out.printf("\n\nO ano %d convertido para o calendario judaico e: %d \n", ano, conta );
		menu();
	}
	public static void islamico(int ano)
	{
		int conta;
		conta = ano - 579;
		System.out.printf("\n\nO ano %d convertido para o calendario islamico e: %d \n", ano, conta );
		menu();
	}
	public static void sair()
	{
		System.exit(0);
	}
	
	public static void menu()
	{
		Scanner ler = new Scanner(System.in);
		
		String lerAno;
		
		int escolha;
		int ano;
        
		System.out.println("\nDigite um ano a ser convertido\n");
		lerAno = ler.nextLine();
		if(lerAno.length() != 4)
		{
			System.out.println("\nVoce digitol um ano invalido \n");
			menu();
		}
		
		ano = Integer.parseInt(lerAno);
		
		if(ano < 0 || ano == 0)
		{
			System.out.println("\nO ano digitado nao foi identificado\n");
			menu();
		}	
		
		System.out.println("\nDigite 1 para judeu ou 2 para islamico e 3 para sair \n");
		escolha = ler.nextInt();
		
		 switch (escolha) 
		 {
			case 1:
			  judeu(ano);
			  break;

			case 2:
			  islamico(ano);
			  break;

			case 3:
			  sair();
			  break;

			default:
			  System.out.printf("\nInsira uma opção válida");
		}
	
	}
  
	public static void main(String args[])
	{  
    
			menu();

    		System.exit(0);
		
	}

}