import java.util.Scanner;
import java.lang.Math;

public class LED {
    public static int resp(String arg){
        int sum = 0;
        for(int i = 0; i < arg.length(); i++){
            switch(arg.charAt(i)){
                case '0':
                    sum+=6;
                break;
                case '1':
                    sum+=2;
                break;
                case '2':
                    sum+=5;
                break;
                case '3':
                    sum+=5;
                break;
                case '4':
                    sum+=4;
                break;
                case '5':
                    sum+=5;
                break;
                case '6':
                    sum+=6;
                break;
                case '7':
                    sum+=3;
                break;
                case '8':
                    sum+=7;
                break;
                case '9':
                    sum+=6;

                }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tam = Integer.parseInt(sc.nextLine());
        if(tam >= 1 && tam <= 1000){

            for(int i = 0; i < tam; i++){
                int v = resp(sc.nextLine());
                if(v >= 1 && v <= (int)(Math.pow(10,100))){
                    System.out.println(v + " leds");
                }

            }        
            
        }
        sc.close();
    }
}
