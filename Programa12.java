package secao06;
//Tipos de dados
//Numericos reais

public class Programa12 {
		public static void main(String[] args) {
			//Tipos primarios/primitivos
			
			//Por padrao, os numeros reais em Java sao considerados double
			float preco1 = 24.4f;
			double preco2 = 24.4;
			
			//Tipos nao primarios		
			Float preco3 = 44.5f;
			Double preco4 = 44.5;
			
			// ---------------IMPORTANTE----------------
			//quantos bits um tipo de dado ocupa em memoria
			
			System.out.println("float/Float " + Float.SIZE + " bits");
			System.out.println("double/Double " + Double.SIZE + " bits");
	
			
			System.out.println("--------Valor Mínimo---------");
			System.out.println("float/Float " + Float.MIN_VALUE); 
			System.out.println("double/Double " + Double.MIN_VALUE);

			
			System.out.println("--------Valor Maxímo---------");
			System.out.println("float/Float " + Float.MAX_VALUE); 
			System.out.println("double/Double " + Double.MAX_VALUE);
			
		}
}
