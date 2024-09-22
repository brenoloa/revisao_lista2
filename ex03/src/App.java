import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int num;
    int escolha;
    int xxx;
    System.out.print("Digite o número -->  : ");
    num = scan.nextInt();

    System.out.println("ESCOLHA A OPÇÃO == ");
    System.out.println("[1] - TABUADA SOMA");
    System.out.println("[2] - TABUADA SUBTRAÇÃO");
    System.out.println("[3] - TABUADA MULTIPLICAÇÃO");
    System.out.println("[4] - TABUADA DIVISÃO");
    System.out.print("------>  : ");
    escolha = scan.nextInt();
    System.out.println();

    switch (escolha) {
        case 1:
            for (int i = 1; i < 11; i++) {
                xxx = num + i;
                System.out.println(num + " + " + i + " = " + xxx);
            }
            break;
        case 2:
            for (int i = 1; i < 11; i++) {
                xxx = num - i;
                System.out.println(num + " - " + i + " = " + xxx);
            }
            break;
        case 3:
            for (int i = 1; i < 11; i++) {
                xxx = num * i;
                System.out.println(num + " x " + i + " = " + xxx);
            }
            break;
        case 4:
            for (int i = 1; i < 11; i++) {
                xxx = num / i;
                System.out.println(num + " / " + i + " = " + xxx);
            }
            break;
        default:
            System.out.println("erro");
    }


}
}
