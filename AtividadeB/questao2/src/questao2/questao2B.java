
package questao2;


public class questao2B {
        public static void main(String[] args) {
        int sum =0;
        int number = 1;
        
        if (number > 1000000){
            System.out.print(">> FIM! O Number é maior que 100000");
        }
        
        while (number <=1000000){
            sum += number;
            number++;
            
            System.out.println(sum);
            System.out.println(number);
        }
        
    }
}
