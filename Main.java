import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int righe;
        int colonne;
        System.out.print("Inserisci righe: ");
        righe=scanner.nextInt();
        System.out.print("inserisci colonne: ");
        colonne= scanner.nextInt();
        Matrix ciao = new Matrix(colonne,righe);
        ciao.randomize();
        Matrix ciao2 = null;
        while (true){
            System.out.print("1) stampa matrice\n" +
                    "2) inverti matrice\n" +
                    "3) stampa matrice invertita\n" +
                    "4) trova numero\n"+
                    "5) esci\n" +
                    "Input:");
            int option=scanner.nextInt();
            switch (option){
                case 1:
                    ciao.stampa();
                    break;
                case 2:
                    ciao2= ciao.inverti();
                    break;
                case 3:
                    ciao2.stampa();
                    break;
                case  4:
                    System.out.println("inserisci numero da cercare: ");
                    int num=scanner.nextInt();
                    cordinatenum trovato=ciao.trovanumero(num);
                    if(trovato.isTrovato()){
                        System.out.println("numero trovato\n"+"righa:"+trovato.getRigha()+"\ncolonna:"+trovato.getColonna()+"\n");
                    }else {
                        System.out.println("numero non trovato\n");
                    }
                    break;
                default:
                    return;
            }
        }

    }
}

