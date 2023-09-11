import java.util.Scanner;

public class Trinca {

    public static int getMaior(Lista list){
        int maior;
        if(list.primeiro == list.ultimo){
            return -1;
        }else{
            maior = list.primeiro.prox.elemento;
            for(Celula tmp = list.primeiro.prox.prox; tmp != null;tmp = tmp.prox){
                if(maior < tmp.elemento)
                    maior = tmp.elemento;
            }
        }
        return maior;
    }

    public static void addList(String vet[], Lista list){
        int contador = 0;
        for(int i = 0; i < vet.length;i++){
            String a = vet[i];
            for(int j = 0; j<vet.length;j++){
                if(a.equals(vet[j]))
                    contador++;
                if(contador >= 3)
                    list.inserirFim(Integer.parseInt(a));
            }
            contador = 0;
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int tamarray;

        Lista list = new Lista();


        for(int i = 0; i < a; i++){
            tamarray = Integer.parseInt(sc.nextLine());
            String tmp = sc.nextLine();
            if(tamarray >=3){
                //System.out.println("a");
                String aux[] = tmp.split(" ");
                addList(aux, list);
            }
            
            System.out.println(getMaior(list));
            list.primeiro.prox = null;
            list.ultimo = list.primeiro;
            
        }
    }   
}

class Celula{
    public  int elemento;
    public Celula prox;
    Celula(){
        elemento = -1;
        prox = null;
    }
    Celula(int a){
        elemento = a;
        prox = null;
    }
}

class Lista{
    public Celula primeiro, ultimo;
    Lista(){
        primeiro = new Celula();
        ultimo = primeiro;
    }

    public void inserirFim(int x){
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }

}

