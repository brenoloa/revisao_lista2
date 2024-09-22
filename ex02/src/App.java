import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double num;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;


        for (int i = 0; i < 5; i++){
            
            do {
                System.out.println("Digite N"+i+":  ");
                num = scan.nextDouble();
            } while (num < 0);
        
            if (num > maior){
                maior = num;
            }

            if(num < menor){
                menor = num;
            }
        
        
        
        
        }
        System.out.println("MAIOR: " + maior);
        System.out.println("MENOR: " + menor);
    
    }

}
