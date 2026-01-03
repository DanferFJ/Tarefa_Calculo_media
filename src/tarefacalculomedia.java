import org.w3c.dom.Notation;

public class tarefacalculomedia {
    public static void main(String[] args) {
        int nota = 5;
        int nota1 = 3;
        int nota2 = 7;
        int nota3= 8;

        int media = (nota + nota1 + nota2 + nota3) /3;
        System.out.println("Primeira nota " + nota);
        System.out.println("Segunda nota " + nota1);
        System.out.println("Terceira nota " + nota2);
        System.out.println("Quarta nota " + nota3);
        System.out.println("Media: "+ media);
    }
}