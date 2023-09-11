import java.util.Scanner;



public class Bingo {
    public static String resposta(String vet[], String vet2[], int K, int quant){
        String resp = "";
        int contador = 0;
        for(int i = 0;i < vet.length;i++){
            for(int j = 0; j < quant;j++){
                if(vet[i].contains(vet2[j]))
                    contador++;
                if(contador == K){
                    resp += (i+1);
                    resp += " ";
                }
            }
            contador = 0;
        }
        return resp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String aux[] = line.split(" ");
        int N = Integer.parseInt(aux[0]);
        int K = Integer.parseInt(aux[1]);
        int U = Integer.parseInt(aux[2]);
        String[] vet = new String[N];
        
        for(int i = 0; i < N; i++)
            vet[i] = sc.nextLine();   
            
        
        String aux2 = sc.nextLine();
        String vet2[] = aux2.split(" ");
        String resp = "";
        int aux3 = K;
        while(resp.length() == 0){
            resp = resposta(vet,vet2,K,aux3++);
            
        }
        System.out.println(resp);

        
        
        
    }
}

/***
 * Outra solução, salvar tudo em um vetor de string e usar o contains para pesquisar se existe
 * String.contains(1) por ex
 * 
 * 
 */