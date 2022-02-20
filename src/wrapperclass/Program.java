package wrapperclass;

public class Program {
    public static void main(String[] args) {

        int x=20;
        Object obj = x; //
        System.out.println(obj);
        int y = (int) obj; //o (int) é chamado de casting, Podemos tira-lo ao substituir Object pela classe
        // Integer na linha 7
        System.out.println(y);
    }
}
