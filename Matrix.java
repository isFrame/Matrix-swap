import java.util.Random;
class Matrix {

    int[][] array;
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
    public int[][] inverti(){
        int[][] ciao= new int[array[0].length][array.length];

        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                ciao[i][j]=array[j][i];
            }
        }
        return ciao;
    }
    public void stampa2(int[][] array){
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(ints[j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

}
