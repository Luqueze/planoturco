import java.util.Scanner;

class IdaAFeira {
    public static int parseToInt(String x) {
        try{
            return Integer.parseInt(x);
        } catch(NumberFormatException e) {
            return 0;
        }
    }

    public static double parseToDouble(String x) {
        try{
            return Double.parseDouble(x);
        } catch(NumberFormatException e) {
            return 0.00f;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sQtdLista = sc.nextLine();
        int qtdLista = parseToInt(sQtdLista);
        int count = 0;
        String mainData = "";
        String[] arrNomeFruta = new String[100];
        String[] arrQtd = new String[100];
        int realFrutaLength = 0;
        double total = 0.00f;

        while(count < qtdLista) {
            String sQtdFrutas = sc.nextLine();
            int qtdFrutas = parseToInt(sQtdFrutas);
            for (int i = 0; i < qtdFrutas; i++) {
                String readFruta = sc.nextLine();
                mainData = mainData + readFruta;
            }
            String sQtdCadaFrutas = sc.nextLine();
            int qtdCadaFruta = parseToInt(sQtdCadaFrutas);
            for (int i = 0; i < qtdCadaFruta; i++) {
                String readFruta = sc.nextLine();
                String[] frutaX = new String[2];
                frutaX = readFruta.split(" ");
                arrNomeFruta[i] = frutaX[0];
                arrQtd[i] = frutaX[1];
                realFrutaLength++;
            }
            for (int i = 0; i < realFrutaLength; i++) {
                if(mainData.contains(arrNomeFruta[i])) {
                    String y = mainData.split(arrNomeFruta[i])[1].substring(0, 5).substring(1, 5);
                    double preco = parseToDouble(y);
                    int qtd = parseToInt(arrQtd[i]);
                    total = total + (qtd * preco);
                }
            }
            System.out.println("R$ " + total);
            arrNomeFruta = new String[100];
            arrQtd = new String[100];
            realFrutaLength = 0;
            total = 0.00f;
            count++;
        }
    }
}