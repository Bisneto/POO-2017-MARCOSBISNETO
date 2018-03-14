
// resto da 2 questao 
public class TestErro3 {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("fim do main");
	}
	
	static void metodo1(){
		System.out.println("inicio do metodo1");
		try{
			metodo2();
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("erro: " + e );
		}
		System.out.println("fim do metodo1");
	}
	
	static void metodo2(){
		System.out.println("inicio do metodo2");
		int[] array = new int[10];
		for(int i = 0; i <=20; i++){
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("fim do metodo2");
	}

}