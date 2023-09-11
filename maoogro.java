import java.util.Scanner;

public class maoogro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a <= 5){
            for(int i = 0; i < a; i++){
                System.out.print("I");
            }
            System.out.print("\n*");
            
        }else{
            System.out.println("IIIII");
            for(int i = 0; i < a-5;i++){
                System.out.print("I");
            }
        }
    }
}
