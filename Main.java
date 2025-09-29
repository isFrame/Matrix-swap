
public class Main {
    public static void main(String[] args) {
         int[][] original ={{1,2,3},{4,5,6},{7,8,9}};
         int[][] duplicate=new int[3][3];
        System.out.println("Originale: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(original[i][j]);
            }
        }
        System.out.println("\nDopo:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                duplicate[i][j]=original[j][i];
                System.out.println(duplicate[i][j]);
            }
        }
    }
}