import java.util.Scanner;

public class ordemtstname {
    public static String[] str;

    public static void swap(int i, int j){
        String tmp = str[i];
        str[i] = str[j];
        str[j] = tmp;
    }
    public static void selectionSort(){
        for(int i = 0; i <str.length-1;i++){
            int menor = i;
            for(int j = i+1;j<str.length;j++){
                if(str[i].compareTo(str[j])>0){
                    menor = j;
                }
            }
            swap(i, menor);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());

        str = new String[a];

        for(int i = 0; i<a;i++){
            str[i] = new String();
            str[i] = sc.nextLine();
        }
        selectionSort();
        for(int i = 0; i<a; i++){
            System.out.print(str[i]);
        }  

    }
}
