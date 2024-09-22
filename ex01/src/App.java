import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean industria_1 = true;
        boolean industria_2 = true;
        boolean industria_3 = true;

        float poluicao;
        try (Scanner scar = new Scanner(System.in)) {
            System.out.println("NÍVEL DE POLUIÇÃO:  ");
            poluicao = scar.nextFloat();
        }

        if (poluicao >= 0.05 && poluicao <= 0.25){
            System.out.println("NÍVEL OK.");
            
        }
        else if(poluicao >= 0.3 && poluicao <= 0.39){
            System.out.println("[! # !]");
            industria_1 = false;
        }
        else if (poluicao >= 0.4 && poluicao <= 0.49){
            System.out.println("Alerta [!]");
            industria_1 = false;
            industria_2 = false;
        }
        else if (poluicao >= 0.5){
            System.out.println("Alerta [!!!]");
            industria_1 = false;
            industria_2 = false;
            industria_3 = false;
        }
        
        System.out.println("INDUSTRIA 1 -> " + industria_1);
        System.out.println("INDUSTRIA 2 -> " + industria_2);
        System.out.println("INDUSTRIA 3 -> " + industria_3);
        

        
    }
}
