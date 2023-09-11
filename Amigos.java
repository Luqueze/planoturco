import java.util.*;

class Celula{
    String nome;
    Celula prox;
    Celula(String nome ){
        this.nome = nome;
        prox = null;
    }
}

class Amigos{

    public static boolean hasPerson(String vet[], String Person){
        boolean a = false;
        for(int i = 0; i<vet.length;i++)
            if(vet[i].equals(Person))
                a = true;
        
        return a;
    }

    public static boolean hasSpace(String a){
        boolean retorno = false;
        for(int i = 0; i <a.length();i++){
            if(a.charAt(i) == ' '){
                retorno = true;
                i = a.length();
            }
        }
        return retorno;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String L = sc.nextLine();
        String N = sc.nextLine();
        String S = sc.nextLine();

        //System.out.println(L);
        //System.out.println(N);

        String[] vetL = L.split(" ");
        String[] vetN = N.split(" ");

        String listfinal = "";

        if(!S.equals("Nao")){
            for(int i = 0; i < vetL.length;i++){
                if(!S.equals(vetL[i])){
                    listfinal += vetL[i];
                    listfinal += " ";
                    //System.out.println(listfinal);
                }else{
                    for(int j = 0; j < vetN.length; j++){
                        listfinal += vetN[j];
                        listfinal += " ";
                    }
                    listfinal += vetL[i];
                    listfinal += " ";
                }
            }
        }else{
            for(int i = 0; i < vetL.length;i++){
                listfinal += vetL[i];
                listfinal += " ";
            }

            for(int i = 0; i < vetN.length;i++){
                listfinal += vetN[i];
                listfinal += " ";
            }


        }
        System.out.println(listfinal);

    }
}