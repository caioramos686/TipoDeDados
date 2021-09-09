package secao06;
//Tipos de dados
//Numericos inteiros

public class Programa11 {
	public static void main(String[] args) {
		//Tipos primarios/primitivios
		
		long num0 = 99; 
		int num1 = 4; //Inteiro
		short num2 = 4; //Inteiro (curto/menor)
		byte num3 = 4; 
		
		char num8 = 34; //Tabela ascii
		
		//Tipo nao primarios
		
		Long num7= (long) 99999; //Operação chama Cast
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9;
		
		Character num9 = 35; //Tabela ascii
		
		// ---------------IMPORTANTE----------------
		//quantos bits um tipo de dado ocupa em memoria
		
		System.out.println("Char/Character " + Character.SIZE + " bits");
		System.out.println("long/Long " + Long.SIZE + " bits");
		System.out.println("int/Integer " + Integer.SIZE + " bits");
		System.out.println("short/Short " + Short.SIZE + " bits");
		System.out.println("byte/Byte " + Byte.SIZE + " bits");
		
		System.out.println("--------Valor Mínimo---------");
		System.out.println("Char/Character " + Character.MIN_VALUE); //0
		System.out.println("long/Long " + Long.MIN_VALUE);
		System.out.println("int/Integer " + Integer.MIN_VALUE);
		System.out.println("short/Short " + Short.MIN_VALUE);
		System.out.println("byte/Byte " + Byte.MIN_VALUE);
		
		System.out.println("--------Valor Maxímo---------");
		System.out.println("Char/Character " + Character.MAX_VALUE); //65535
		System.out.println("long/Long " + Long.MAX_VALUE);
		System.out.println("int/Integer " + Integer.MAX_VALUE);
		System.out.println("short/Short " + Short.MAX_VALUE);
		System.out.println("byte/Byte " + Byte.MAX_VALUE);
	}
}
