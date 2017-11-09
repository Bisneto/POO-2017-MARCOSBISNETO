
package questao2;

public class Questao2 {

    public static void main(String[] args) {
        int sum =0;
        int number = 1;
        
        if (number > 100){
            System.out.print(">> FIM! O Number é maior que 100");
        }
        
        while (number <=100){
            sum = sum + number;
            number = number +1;
            
            System.out.println(sum);
            System.out.println(number);
        }
        
    }
    
}
