import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		int opcao;
		double a, b;
		
		do {
			System.out.println("Escolha a opção desejada: ");
			System.out.println("1 -> Somar");
			System.out.println("2 -> Subtrair");
			System.out.println("3 -> Multiplicar");
			System.out.println("4 -> Dividir");
			System.out.println("5 -> Cubo");
			System.out.println("6 -> Média Aritimetica");
			System.out.println("7 -> Menor/Maior numero");
			System.out.println("0 -> Sair");
			opcao = ler.nextInt();
			
			if( opcao==1 ) {
				System.out.println("Informe o primeiro valor: ");
				a = ler.nextDouble();
				
				System.out.println("Infomre o segundo valor: ");
				b = ler.nextDouble();
				
				System.out.println("O resultado é: " + calc.somar(a,b));
			} else if( opcao==2 ) {
				System.out.println("Informe o primeiro valor: ");
				a = ler.nextDouble();
				
				System.out.println("Infomre o segundo valor: ");
				b = ler.nextDouble();
				
				System.out.println("O resultado é: " + calc.subtrair(a,b));
			}else if( opcao==3 ) {
				System.out.println("Informe o primeiro valor: ");
				a = ler.nextDouble();
				
				System.out.println("Infomre o segundo valor: ");
				b = ler.nextDouble();
				
				System.out.println("O resultado é: " + calc.multiplicar(a,b));
			}else if( opcao==4 ) {
				System.out.println("Informe o primeiro valor: ");
				a = ler.nextDouble();
				
				System.out.println("Infomre o segundo valor: ");
				b = ler.nextDouble();
				
				System.out.println("O resultado é: " + calc.dividir(a,b));
			}else if( opcao==5 ) {

				System.out.println("Informe um valor");
				a = ler.nextDouble();

				System.out.println("O cubo desse número é: " + calc.fazerCubo(a));
				
			}else if( opcao==6 ) {
				
				System.out.println("A média aritimética é: " + calc.fazerMedia());
				
			}else if( opcao==7 ) {
				
				calc.descobrirMaiorMenor();
				
			}
			
		}while( opcao!=0 );
	}
}
