import java.util.*;

public class Batuke {
    public static int mov = 0;
    // 1 célula à direita, uma abaixo, seguida por duas à esquerda, duas acima,
    // então 3 à direita, 3 para baixo, então 4, e assim por diante.
    public static String caminho(int matriz[][], int L, int C) {
        int l = matriz.length;
        int aux = 0;

        String a = "";
        int count = 1;
        while(count < 16){
        //for(int k = 0; k< 2;k++){
            if(count == 1){
                if ((L < l && C < l) && (L > -1 && C > -1)) {
                    if (pesquisa(a, matriz[L][C])) {
                        a += matriz[L][C];
                        a += " ";
                        count++;
                    }
                    mov++;
                    System.out.println(mov);
                }
            } 
            aux++;
            for(int o = 0; o < aux;o++){
                if(count == 16){
                    return a;
                }
                C++;
                if ((L < l && C < l) && (L > -1 && C > -1)) {
                    if (pesquisa(a, matriz[L][C])) {
                        a += matriz[L][C];
                        a += " ";
                        count++;
                    }
                }
                mov++;
            }
            System.out.println(mov);

           
            for(int o = 0; o < aux;o++){
                if(count == 16){
                    return a;
                }
                L++;
                if ((L < l && C < l) && (L > -1 && C > -1)) {
                    if (pesquisa(a, matriz[L][C])) {
                        a += matriz[L][C];
                        a += " ";
                        count++;
                    }
                }
                mov++;
            }
            System.out.println(mov);

            aux++;
            for(int o = 0; o < aux;o++){
                if(count == 16){
                    return a;
                }
                C--;
                if ((L < l && C < l) && (L > -1 && C > -1)) {
                    if (pesquisa(a, matriz[L][C])) {
                        a += matriz[L][C];
                        a += " ";
                        count++;
                    }
                }
                mov++;
            }
            System.out.println(mov);

      
            for(int o = 0; o < aux;o++){
                if(count == 16){
                    return a;
                }
                L--;
                if ((L < l && C < l) && (L > -1 && C > -1)) {
                    if (pesquisa(a, matriz[L][C])) {
                        a += matriz[L][C];
                        a += " ";
                        count++;
                    }
                }
                mov++;
            }
            System.out.println(mov);

        }
        return a;
    }

    public static boolean pesquisa(String a, int b) {
        boolean c = true;
        if (a.indexOf(b) >= 0)
            c = false;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, L, C;
        N = sc.nextInt();
        L = sc.nextInt();
        C = sc.nextInt();

        int matriz[][] = new int[N][N];

        int a = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                matriz[i][j] = a++;

        }
        System.out.println(caminho(matriz,L,C));
        System.out.println(mov);

    }
}
