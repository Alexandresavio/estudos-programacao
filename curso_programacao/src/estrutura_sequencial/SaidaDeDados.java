package estrutura_sequencial;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		// Para escrever na tela um texto qualquer

		// Sem quebra de linha ao final:
		System.out.print("Bom dia!");

		// com quebra de linha
		System.out.println(" Primeira linha");

		System.out.println(" Segunda linha");

		/*
		 * Para escrever o conteúdo de uma variável de algum tipo básico
		 *  Suponha uma variável tipo intdeclarada e iniciada:
		 * */
		int y = 32;
		System.out.println(y);
		
		/*
		 * Para escrever o conteúdo de uma variável com ponto flutuante
		 * Suponha uma variável tipo doubledeclarada e iniciada:
		 */
		double x = 10.35784;
		System.out.println(x);
		
		/*
		 * Para controlar o número de casas decimais depois da virgula, 
		 * utilize o comando System.out.printf();
		 */
		System.out.printf("%.2f\n",x);
		System.out.printf("%.4f\n",x);
		
		// Para considerar o separador de decimais como ponto, ANTESda declaração do Scanner, faça:
		//Locale.setDefault(Locale.US);
		
		/*
		 * Para concatenar vários elementos em um mesmo comando de escrita
		 * Regra geral para print e println:
		 *  elemento1  +  elemento2  +  elemento3  +  ...  + elementoN
		 */
		System.out.println("Resultado = "+x+" metros");
		
		/*
		 * Para concatenar vários elementos em um mesmo comando de escrita
		 *  Regra geral para printf:
		 *   "TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2 
		 *   
		 *   %f = ponto flutuante
		 *   %d = inteiro
		 *   %s = texto
		 *   %n = quebra de linha
		 *   
		 */
		System.out.printf("Resultado = %.2f metros %n ", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos de idade e renda de R$ %.2f reais \n", nome, idade, renda );
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
