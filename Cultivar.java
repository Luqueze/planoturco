import java.util.Scanner;

class Cultivar{

    static int printar = 0;
    public static int retorno(String[] args){
        int count = 0;
        String a,b;
        for(int i = 0; i < (args.length-1);i++){
            boolean resp = true;
            a = args[i];
            b = args[i+1];
            for(int j = 0; j < b.length();j++){
                if(a.charAt(0) == b.charAt(j) && a.length() < b.length()){
                    for(int k = 1; k < a.length();k++){
                        if((j+k) < b.length() && a.charAt(k) != b.charAt(j+k)){
                            resp = false;
                            k = a.length();
                            j = b.length();
                        }
                    }
                }
            }
            if(resp == true){
                count++;
            }
        }
        return --count;
    }

    public static void main(String[] args){
        int tam = 1;
        Scanner sc = new Scanner(System.in);
        while(tam != 0){
            tam = Integer.parseInt(sc.nextLine());
            String[] vetString = new String[tam];
            for(int i = 0; i < tam; i++){
                vetString[i] = sc.nextLine();
            }
            System.out.println(retorno(vetString));

        }
        sc.close();
        
    }
}