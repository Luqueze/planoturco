import java.util.*;

public class questao01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int aux[] = new int[N];
        for(int i = 0; i < N;i++){
            aux[i] = sc.nextInt();
        }
        int contpeq = 0, contmed = 0;
        for(int i = 0; i < aux.length;i++){
            if(aux[i] == 1)
                contpeq++;
            if(aux[i] == 2)
                contmed++;
        }
        int prodPeq = sc.nextInt();
        int pordMed = sc.nextInt();

        if(prodPeq >= contpeq && pordMed >= contmed)
            System.out.println('S');
        else
            System.out.println('N');

    }
}
