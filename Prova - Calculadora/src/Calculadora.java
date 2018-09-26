import java.util.Scanner;

public class Calculadora {
	
	Scanner ler = new Scanner(System.in);
	
	public double somar(double a, double b) {
		return a + b;
	}	
	
	public double subtrair(double a, double b) {
		return a - b;
	}
	
	public double multiplicar(double a, double b) {
		return a * b;
	}
	
	public double dividir(double a, double b) {
		return a / b;
	}	
	
	public double fazerCubo(double a) {
		
		return a*a*a;
	}
	
	public double fazerMedia() {
		int i = 0, condicao;
		double soma = 0;
		do {
			System.out.println("Informe um valor");
			soma += ler.nextDouble();
			i++;
			System.out.println("Deseja informar outro valor? 1 - sim / 2 - não");
			condicao = ler.nextInt();
		}while( condicao!=2 );
		return soma/i;
	}
	
	public void descobrirMaiorMenor() {
		int condicao;
		double num, maior, menor;
		System.out.println("Informe um valor: ");
		num = ler.nextDouble();
		maior = num;
		menor = num;
		do {
			System.out.println("Informe um valor: ");
			num = ler.nextDouble();
			
			if( num > maior ) {
				maior = num;
			}else if( num < menor) {
				menor = num;
			}
			
			System.out.println("Deseja informar outro valor? 1 - sim / 2 - não");
			condicao = ler.nextInt();
		}while( condicao!=2 );
		
		System.out.println("Maior: " + maior + " / Menor: " + menor);
	}
}
