
public class CheckedException {
	
	public static void metodo() throws java.io.FileNotFoundException{
		try{
			new java.io.FileInputStream("arquivo.txt");
		} catch(java.io.FileNotFoundException e ){
			System.out.println("Nao foi possivel abrir o arquivo para leitura");
		}
	}

}
