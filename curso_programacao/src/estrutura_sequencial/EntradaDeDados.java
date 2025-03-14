package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		
		/*
		 * Para fazer entrada de dados, nós vamos criar um objeto do tipo "Scanner" da seguinte forma:
		 */
		Scanner sc = new Scanner(System.in);
		
		//Para ler uma palavra (texto sem espaços)
		System.out.println("Qual é o seu nome?");
		String nome = sc.next();
		System.out.println("Olá, "+nome);
		
		//Para ler um número inteiro
		System.out.println("Digite um número inteiro:");
		int numero = sc.nextInt();
		System.out.println("O número digitado foi: "+numero);
		
		//Para ler um número com ponto flutuante
		System.out.println("Digite um número com casas decimais:");
		
		/**
		 *  ATENÇÃO: 
		 * Para considerar o separador de decimais como ponto,
		 * ANTES da declaração do Scanner, faça: Locale.setDefault(Locale.US);
		 */
		double numero2 = sc.nextDouble();
		System.out.println("Foi digitado o valor: "+numero2);
		
		//Para Ler um caractere
		System.out.println("Digite uma palavra:");
		char x = sc.next().charAt(0);
		System.out.println("A primeira letra da palavra digitada é: "+x);
		
		//Para ler vários dados na mesma linha
		
		System.out.println("Informe seu sobrenome:");
		String a = sc.next();		
		System.out.println("Informe sua idade:");
		int b = sc.nextInt();		
		System.out.println("Informe seu peso(Kg):");
		double c = sc.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//Para ler um texto ATÉ A QUEBRA DE LINHA		
		
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		sc.close();
		
	}
}
