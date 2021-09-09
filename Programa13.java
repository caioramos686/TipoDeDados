package secao06;
//Tipos de Dados alfanum�ricos
//Caracteres e Strings
public class Programa13 {

	public static void main(String[] args) {
		
		//Tipos primitivos
		char letra1 = 'a';
		char letra2 = 97; //ascii
		
		
		System.out.println("Letra1 " + letra1);
		System.out.println("Letra2 " + letra2);
		
		//Tipos nao primitivos
		Character letra3 = 'A';
		String nome = "Geek University";
		
		
		System.out.println("Letra3 " + letra3);
		System.out.println("Nome " + nome);
		
		// ---------------IMPORTANTE----------------
		//quantos bits um tipo de dado ocupa em memoria
					
		System.out.println("char/Character" + Character.SIZE + " bits");
		//System.out.println("String " + String.SIZE + "bits");
		System.out.println("String " + Character.SIZE * nome.length() + " bits"); //Para alocar (Geek University) na mem�ria
		System.out.println("Tamanho da String " + nome.length());
		
		
		System.out.println("--------Valor M�nimo---------");
		System.out.println("char/Character " + Character.MIN_VALUE); //0
	

		
		System.out.println("--------Valor Max�mo---------");
		System.out.println("char/Character " + Character.MAX_VALUE); //65535

	}
}
