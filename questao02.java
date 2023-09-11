import java.util.*;

class questao02{

    public static void printvet(int vet[]){
        for(int i = 0; i < vet.length;i++)
            System.err.print(vet[i]+ " ");
    }

    public static int[] selectionSort(int vet[]){
        int vetaux[] = new int[vet.length];
        for(int i = 0; i < vet.length;i++)
            vetaux[i] = vet[i];

        //System.out.println("lucas");
        //printvet(vetaux);
        

        for(int i = 0;i<vetaux.length-1;i++){
            int menor = i;
            for(int j = i+1;j<vet.length;j++){
                if(vetaux[menor] < vetaux[j])
                    menor = j;
            }

                int tmp = vetaux[i];
                vetaux[i] = vetaux[menor];
                vetaux[menor] = tmp;
        }

        return vetaux;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N;i++){
            int tamVet = sc.nextInt();
            int vet[] = new int[tamVet];
            for(int j = 0; j < tamVet;j++)
                vet[j] = sc.nextInt();
            int vetordenado[] = selectionSort(vet);
            int contador = 0;
            for(int j = 0; j < vet.length;j++){
                if(vet[j] == vetordenado[j]){
                    contador++;k
                }
            }
            System.out.println(contador);
        }
    }
}