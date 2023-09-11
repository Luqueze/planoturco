import java.util.*;
public class Sudoku {
    public static boolean verificacao(int vet[]){
        boolean Torf = false;
        for(int i = 0; i < vet.length;i++){
            if(vet[i] > 1)
                Torf = true;
        }
        return Torf;
    }

    public static boolean comparalinha(int m[][]){
        int vet[] = new int[9];

        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(m[j][i] == 1){
                    vet[0]++;
                }else if(m[j][i] == 2){
                    vet[1]++;
                }else if(m[j][i] == 3){
                    vet[2]++;
                }else if(m[j][i] == 4){
                    vet[3]++;
                }else if(m[j][i] == 5){
                    vet[4]++;
                }else if(m[j][i] == 6){
                    vet[5]++;
                }else if(m[j][i] == 7){
                    vet[6]++;
                }else if(m[j][i] == 8){
                    vet[7]++;
                }else if(m[j][i] == 9){
                    vet[8]++;
                }   
            }
           
            if(verificacao(vet))
            return false;
            
            for(int k = 0; k < 9;k++)
            vet[k] = 0;
            
        }
        
        int vet2[] = new int[9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(m[i][j] == 1){
                    vet2[0]++;
                }else if(m[i][j] == 2){
                    vet2[1]++;
                }else if(m[i][j] == 3){
                    vet2[2]++;
                }else if(m[i][j] == 4){
                    vet2[3]++;
                }else if(m[i][j] == 5){
                    vet2[4]++;
                }else if(m[i][j] == 6){
                    vet2[5]++;
                }else if(m[i][j] == 7){
                    vet2[6]++;
                }else if(m[i][j] == 8){
                    vet2[7]++;
                }else if(m[i][j] == 9){
                    vet2[8]++;
                }   
            }
            if(verificacao(vet2)){
                return false;
            }
            for(int k = 0; k < 9;k++)
                vet2[k] = 0;
            
        }

        return true;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[9][9];
        int quant = sc.nextInt();
        for(int l = 0; l < quant;l++){

            for(int i = 0; i < 9;i++){
                for(int j = 0; j < 9;j++){
                    matriz[i][j] = sc.nextInt();

                }
            }
            System.out.println("Instancia "+(l+1));
            if(comparalinha(matriz))
                System.out.println("SIM");
            else
                System.out.println("NAO");
            System.out.println();    
        }
    }
}
