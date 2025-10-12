import java.util.ArrayList;
import java.util.Scanner;

class contatti {
    private String numero;
    private String nome;
    private String indirizzo;

    public contatti(String numero, String nome, String indirizzo) {
        this.numero = numero;
        this.nome = nome;
        this.indirizzo=indirizzo;
    }
    public void stampa(){
        System.out.print("Nome:" + getNome()+"\nNumero"+getNumero()+"\nIndirizzo:"+getIndirizzo()+"\n");
    }


    public String getNumero() {
        return numero;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}

class Rubrica{
     ArrayList<contatti>rubrica;

    public Rubrica(ArrayList<contatti> rubrica) {
        this.rubrica = rubrica;
    }
    public void stampatutto(){
        if(rubrica!=null) {
            for (contatti contatto : rubrica) {
                contatto.stampa();
            }
        }else{
            System.out.println("rubrica vuota");
        }
    }
    public void aggiungi(contatti contatto){
        rubrica.add(contatto);
    }
    public void rimuovi(){
        if(rubrica!=null){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Rimuovi per\n1) nome\n2) numero\n\nInput:");
            int input = scanner.nextInt();
            boolean trovato = false;
            switch (input) {
                case 1:
                    System.out.println("Inserisci nome:");
                    String nome = scanner.next();
                    for (contatti contatto : rubrica) {
                        if (contatto.getNome().equals(nome)) {
                            rubrica.remove(contatto);
                            trovato = true;
                            break;
                        }
                    }
                    if (!trovato) {
                        System.out.println("contatto non trovato");
                    }
                    break;
                case 2:
                    System.out.println("Inserisci numero:");
                    String numero = scanner.next();
                    for (contatti contatto : rubrica) {
                        if (contatto.getNumero().equals(numero)) {
                            rubrica.remove(contatto);
                            trovato = true;
                            break;
                        }
                    }
                    if (!trovato) {
                        System.out.println("contatto non trovato");
                    }
                    break;
                default: {
                    System.out.println("Opzione non esistente");
                }
            }
            scanner.close();
        }
    }
    public void stampaspecifico(){
        if(rubrica!=null) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("cerca per\n1) nome\n2) numero\n\nInput:");
            int input = scanner2.nextInt();
            boolean trovato = false;
            switch (input) {
                case 1:
                    System.out.println("Inserisci nome:");
                    String nome = scanner2.next();
                    for (contatti contatto : rubrica) {
                        if (contatto.getNome().equals(nome)) {
                            contatto.stampa();
                            trovato = true;
                            break;
                        }
                    }
                    if (!trovato) {
                        System.out.println("contatto non trovato");
                    }
                    break;
                case 2:
                    System.out.println("Inserisci numero:");
                    String numero = scanner2.next();
                    for (contatti contatto : rubrica) {
                        if (contatto.getNumero().equals(numero)) {
                            contatto.stampa();
                            trovato = true;
                            break;
                        }
                    }
                    if (!trovato) {
                        System.out.println("contatto non trovato");
                    }
                    break;
                default: {
                    System.out.println("Opzione non esistente");
                }
            }
            scanner2.close();
        }else System.out.println("Rubrica vuota");

    }
}
