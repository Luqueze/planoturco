import java.util.Scanner;

class Celula {

    public String elemento;
    public Celula prox;
  
    Celula() {
      elemento = "";
      prox = null;
    }
  
    Celula(String e) {
      elemento = e;
      prox = null;
    }
  
    Celula(String e, Celula p) {
      elemento = e;
      prox = p;
    }
  }

class Lista {

    public Celula primeiro, ultimo;
    public int tamanho = -1;
  
    public Lista() {
      primeiro = new Celula();
      ultimo = primeiro;
      tamanho++;
    }
  
    public void inserirInicio(String x) {
      Celula tmp = new Celula(x);
      tmp.prox = primeiro.prox;
      primeiro.prox = tmp;
      if (primeiro == ultimo) {
        ultimo = tmp;
      }
      tmp = null;
      tamanho++;
    }
  
    public void inserirFim(String x) {
      Celula c = new Celula(x);
      ultimo.prox = c;
      ultimo = c;
      tamanho++;
    }
  
    public String removerInicio() throws Exception {
      if (primeiro == ultimo) throw new Exception("Erro!");
      Celula tmp = primeiro;
      primeiro = primeiro.prox;
      String elemento = primeiro.elemento;
      tmp.prox = null;
      tmp = null;
      tamanho--;
      return elemento;
    }
  
    public String removerFim() throws Exception {
      if (primeiro == ultimo) throw new Exception("Erro!");
      Celula i;
      for (i = primeiro; i.prox != ultimo; i = i.prox);
      String elemento = ultimo.elemento;
      ultimo = i;
      i = ultimo.prox = null;
      tamanho--;
      return elemento;
    }
  
    public void inserir(String x, int pos) throws Exception {
      // int tamanho = tamanho();
      if (pos < 0 || pos > tamanho) {
        throw new Exception("Erro!");
      } else if (pos == 0) {
        inserirInicio(x);
      } else if (pos == tamanho) {
        inserirFim(x);
      } else {
        Celula i = primeiro;
        for (int j = 0; j < pos; j++, i = i.prox);
        Celula tmp = new Celula(x);
        tmp.prox = i.prox;
        i.prox = tmp;
        tmp = i = null;
        tamanho++;
      }
    }
  
    public String remover(int pos) throws Exception {
      // int tamanho = tamanho();
      String elemento;
      if (primeiro == ultimo || pos < 0 || pos >= tamanho) {
        throw new Exception("Erro!");
      } else if (pos == 0) {
        elemento = removerInicio();
      } else if (pos == tamanho - 1) {
        elemento = removerFim();
      } else {
        Celula i = primeiro;
        for (int j = 0; j < pos; j++, i = i.prox);
        Celula tmp = i.prox;
        elemento = tmp.elemento;
        i.prox = tmp.prox;
        tmp.prox = null;
        i = tmp = null;
      }
      tamanho--;
      return elemento;
    }
    
    public String retornaElemento(int pos) {
        Celula tmp = new Celula();
        if (pos < tamanho) {
            for(int i=0; i < pos; i++) {
                tmp = tmp.prox;
            }
        }
        return tmp.elemento;
    }

    public void mostrar() {
      Celula temp = primeiro.prox;
      boolean flag = true;
      int i = 0;
      while (flag) {
        MyIO.print("[" + i + "]  ");
        MyIO.print(temp.elemento);
        if (temp.prox == null) {
          flag = false;
        } else {
          temp = temp.prox;
        }
        i++;
      }
    }
  }
class Provaq1 {
    public static int parseToInt(String x) {
        try{
            return Integer.parseInt(x);
        } catch(NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sQtdLista = sc.nextLine();
        int qtdLista = parseToInt(sQtdLista);
        int count = 0;
        int qtdCharsOnThis = 0;
        int qtdEconomia = 0;
        // String mainData = "";
        Lista l = new Lista();
        while(count < qtdLista) {
            String numeroTelefone = sc.nextLine();
            // mainData = mainData + " / " + numeroTelefone;
            try {
                l.inserir(numeroTelefone, count);
            } catch (Exception e) {
                MyIO.print(e.getMessage());
            }
            qtdCharsOnThis = numeroTelefone.length();
            count++;
        }

        Lista l2 = new Lista();
        for(int i=0; i < l.tamanho; i++) {
            String p = l.retornaElemento(i);
            for (int j=0; j < qtdCharsOnThis; j++) {
                try {
                    l2.inserir("" + p.charAt(j) + l2.retornaElemento(j), j);
                } catch (Exception e) {
                    MyIO.print(e.getMessage());
                }
            }
        }
        
        for(int i=0; i < l.tamanho; i++) {
            System.out.println(l2.retornaElemento(i));
        }


    }
}