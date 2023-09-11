import java.util.*;

class PaodeQueijo{
/*
 * https://github.com/eduardo-mior/URI-Online-Judge-Solutions/blob/master/Iniciante/URI%202552.java
 * https://www.beecrowd.com.br/repository/UOJ_2552.html?origem=1
 * https://www.beecrowd.com.br/repository/UOJ_2179.html
 * 
 */

    public static int retorno(int matriz[][], int linha, int coluna){
        int l = matriz.length-1;
        int c = matriz[linha].length-1;
        int p = 0;
        if(linha > 0 && matriz[linha-1][coluna] == 1) p++;
        if(linha < l && matriz[linha+1][coluna] == 1) p++;
        if(coluna > 0 && matriz[linha][coluna-1] == 1) p++;
        if(coluna < c && matriz[linha][coluna+1] == 1) p++;
        return p;

    }
    public static void main(String args[]){
        Scanner leitura = new Scanner(System.in);
        //String linhacoluna = leitura.nextLine();
        
        
        while(leitura.hasNextLine()){

            int n = leitura.nextInt();
            int m = leitura.nextInt();
            
            int matriz[][] = new int[n][m];
            for(int i = 0; i<n;i++){
                for(int j = 0; j<m;j++){
                    matriz[i][j] = leitura.nextInt();
                    
                }
            }

            for(int i = 0; i<n;i++){
                for(int j = 0; j<m;j++){
                    if(matriz[i][j] == 1){
                        System.out.print("9");
                    }else{
                        System.out.print(retorno(matriz,i,j));
                    }
                    
                }
                System.out.println();
            }
        
        }

    }
}