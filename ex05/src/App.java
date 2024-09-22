import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int i, a, b, c;
        int menor, maior, meio;
        do { 
            System.out.print("Valor de i: ");
            i = scan.nextInt();
        } while (i < 0);

        System.out.print("Valor de a: ");
        a = scan.nextInt();
        System.out.print("Valor de b: ");
        b = scan.nextInt();
        System.out.print("Valor de c: ");
        c = scan.nextInt();

        if (a >= b && a >= c){
            maior = a;
            if (b > c){
                meio = b;
                menor = c;
            }
            else {
                meio = c;
                menor = b;
            }
        }
        else if (b >= a && b >= c){
            maior = b;
            if (a > c){
                meio = a;
                menor = c;
            }
            else {
                meio = c;
                menor = a;
            }
        }
        else {
            maior = c;
            if (b > a){
                meio = b;
                menor = a;
            }
            else {
                meio = a;
                menor = b;
            }
        }

        switch (i) {
            case 1:
                System.out.println(menor + ", " + meio + ", " + maior);    
                break;
            case 2:
                System.out.println(maior + ", " + meio + ", " + menor);    
                break;
            case 3:
                System.out.println(menor + ", " + maior + ", " + meio);    
                break;
            default:
                System.out.println("erro.");
        }
    }
}
