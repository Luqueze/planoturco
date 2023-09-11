import java.util.*; 
import java.io.*;

public class Fatorial {

  public static int firstFactorial(int num) {
    if(num>1){
      firstFactorial(num-1);
    }  
    if(num == 1){
        return 1;
    }
    return (num*firstFactorial(num-1));
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(firstFactorial(Integer.parseInt(s.nextLine()))); 
  }

}
