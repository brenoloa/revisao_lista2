public class App {
    public static void main(String[] args) throws Exception {
        double[] peso = {56, 65, 68, 34, 55.5, 106, 89};
        int gordo = 0;
        double total = 0;
        double media;
        
        for (int i = 0; i < 7; i++) {
            if (peso[i] > 90){
                gordo++;
            }
            total += peso[i];

        }
        media = (total / 7);

        System.out.println(gordo + " pessoas apresentaram sobre peso a 90kg");

        System.out.println("Média de peso das 7 pessoas: " + media);
    }
}
