//paramos na 142
import java.io.FileNotFoundException;

public class TestaException2 {
	public static void main(String[] args) {
		try {
			new java.io.FileInputStream("arquivo.txt");
		}catch (FileNotFoundException e ){
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
