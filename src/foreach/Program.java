package foreach;

public class Program {

    public static void main(String[] args) {
        String[] vect = new String[] {"Maria","Bob","Alex"};

        for ( int i=0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("-------------------");

        for (String nome : vect) { // Para cada objeto nome contido no vetor vect, faca:
            System.out.println(nome);
        }
    }
}
