import java.util.Scanner;

public class PreinPos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int C = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < C; i++){
            String aux = sc.nextLine();
            int firstChar = aux.charAt(0)-48;
            //System.out.println(firstChar);
            String[] strings = new String[2];
            //System.out.print(aux.substring(2,2+firstChar));
            strings[0] = aux.substring(2,2+firstChar);
            strings[1] = aux.substring(firstChar+3);
            if(strings[0].charAt(0) > strings[1].charAt(0))
                System.out.println(strings[0]);
            else
                System.out.println(strings[1]);
        }
    }
}
