import java.util.Random;
class Matrix {

    private int[][] array;
    public Matrix(int col,int row){
        this.array=new int[row][col];
    }

    public void stampa(){
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(ints[j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    public void randomize(){
        Random rand= new Random();

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j]= rand.nextInt(0,10);

                }
            }
    }
    public Matrix inverti(){
        Matrix ciao= new Matrix(array[0].length,array.length);

        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                ciao.array[i][j]=array[j][i];
            }
        }
        return ciao;
    }
    public cordinatenum trovanumero(int num){
        cordinatenum trovato=new cordinatenum(0,0);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j]==num){
                    trovato.setRigha(i);
                    trovato.setColonna(j);
                    trovato.setTrovato(true);
                    break;
                }
            }
        }
        return trovato;
    }
    public void inseriscinum(cordinatenum cordinate,int num){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (i==cordinate.getRigha()-1&&j==cordinate.getColonna()-1){
                        array[i][j]=num;
                        break;
                    }else {
                        System.out.println("Cordinata non esistente");
                    }
                }
            }
    }
}
class cordinatenum{
    private boolean trovato;
    private int righa;
    private int colonna;
    public cordinatenum(int righa, int colonna){
        this.righa=righa;
        this.colonna=colonna;
        trovato=false;
    }

    public boolean isTrovato() {
        return trovato;
    }

    public int getColonna() {
        return colonna;
    }

    public int getRigha() {
        return righa;
    }

    public void setTrovato(boolean trovato) {
        this.trovato = trovato;
    }

    public void setRigha(int righa) {
        this.righa = righa;
    }

    public void setColonna(int colonna) {
        this.colonna = colonna;
    }
}
