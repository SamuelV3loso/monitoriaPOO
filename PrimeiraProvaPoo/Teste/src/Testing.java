import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int valMax = 0, escolha = 0, indice = 0, atualizar;
		String nome, numero, pesquisar;
		
		System.out.println("Informe o total de contatos da sua agenda: ");
		valMax = read.nextInt();
		read.nextLine();
		
		String agenda[] = new String[valMax];
		
		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 -> Adicionar um contato;");
			System.out.println("2 -> Remover um contato;");
			System.out.println("3 -> Listar contatos;");
			System.out.println("4 -> Pesquisar um contato;");
			System.out.println("5 -> Atualizar um contato");
			System.out.println("0 -> Sair.");
			escolha = read.nextInt();
			read.nextLine();
			
			if( escolha == 1 ) {
				if(indice == valMax) {
					System.out.println("Você excedeu seu limite máximo de contatos, exclua algum.");
				}else {
					System.out.println("Informe o nome do contato: ");
					nome = read.nextLine();
					System.out.println("Informe o número do contato: ");
					numero = read.nextLine();
					
					agenda[indice] = nome + " - " + numero;
					System.out.println(agenda[indice]);
					indice++;
					
					System.out.println("Contato salvo.");
					System.out.println("Pressione qualquer tecla para continuar...");
					read.nextLine();
				}
			}
			else if( escolha == 2 ) {
				for( int i = 0 ; i < indice; i++ ) {
					System.out.println(i+1 + " - " + agenda[i]);
				}
				System.out.println("Informe a posição do numero que deseja excluir: ");
				int excluir = read.nextInt();
				read.nextLine();
				excluir = excluir - 1;
				
				agenda[excluir] = null;
				
				for(int i = excluir; i < agenda.length-1; i++) {
					agenda[i] = agenda[i+1];
				}
				indice--;
				System.out.println("Excluido com sucesso");
				
			}
			else if( escolha == 3 ) {
				for( int i = 0 ; i < indice; i++ ) {
					System.out.println(agenda[i]);
				}
				System.out.println("Pressione qualquer tecla para continuar...");
				read.nextLine();
			}
			else if( escolha == 4 ) {
				System.out.println("Informe o contato que deseja pesquisar: ");
				pesquisar = read.nextLine();
				
				for(int i = 0; i < indice; i++) {
					if(agenda[i].contains(pesquisar)) {
						System.out.println(agenda[i]);
						System.out.println("Digite qualquer tecla para continuar...");
						read.nextLine();
					}
				}
			}
			else if( escolha == 5 ) {
				for( int i = 0 ; i < indice; i++ ) {
					System.out.println(i+1 + " - " + agenda[i]);
				}
				System.out.println("Qual contato deseja atualizar?");
				atualizar = read.nextInt();
				read.nextLine();
				atualizar--;
				
				System.out.println(agenda[atualizar]);
				
				System.out.println("Informe o novo nome do contato: ");
				nome = read.nextLine();
				System.out.println("Informe o novo número do contato: ");
				numero = read.nextLine();
				
				agenda[atualizar] = nome + " - " + numero;
			}
			
		}while(escolha!=0);
	}
}
