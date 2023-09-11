import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;
class infixaposfixa{

    public static String tiraparent(String a){
        String b = "";
        for(int i = 0; i< a.length();i++){
            if(a.charAt(i) == '(' || a.charAt(i) == ')'){

            }else{
                b+=a.charAt(i);
            }
        }
        return b;
    }

    public static String retorno(String a){
        String b = "";
        for(int i = 0; i<a.length();i++){
            if(a.charAt(i) == '(' || a.charAt(i) == ')'){

            }else if(a.charAt(i) == '*' || a.charAt(i) == '/' || a.charAt(i) == '+' || a.charAt(i) == '-'){
                b+=a.charAt(i+1);
                b+=a.charAt(i);
                i++;
            }else{
                b+=a.charAt(i);
            }
        }

        b = tiraparent(b);
        return b;
    }
    public static void main (String args[]){
        Scanner leitura = new Scanner(System.in);
        int N = Integer.parseInt(leitura.nextLine());
        for(int i = 0; i<N;i++){   
            String a = leitura.nextLine();
            System.out.println(retorno(a));
        }
        
    }
}