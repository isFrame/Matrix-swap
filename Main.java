import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<contatti> rubrica=new ArrayList<contatti>();
        Rubrica rubrica1=new Rubrica(rubrica);
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("1) crea contatto\n2) elimina contatto\n3)stampa rubrica\n4)cerca contatto\n\nInput:");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Inserisci numero");
                    String numero = scanner.next();
                    System.out.println("Inserisci nome");
                    String nome = scanner.next();
                    System.out.println("Inserisci indirizzo");
                    String indirizzo = scanner.next();
                    contatti contatto = new contatti(numero, nome, indirizzo);
                    rubrica1.aggiungi(contatto);
                    break;
                case 2:
                    rubrica1.rimuovi();
                    break;
                case 3:
                    rubrica1.stampatutto();
                    break;
                case 4:
                    rubrica1.stampaspecifico();
                    break;
                default:
                    return;
            }
        }
    }
}