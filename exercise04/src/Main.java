import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[5][10];
        int[]sumRow = new int[5];
        Random  random = new Random();

        for(int i=0;i<5;i++){
            int sum = 0;
            for(int j = 0; j < 10; j++){
                int num = random.nextInt(300);
                matrix[i][j]= num;
                sum = sum + matrix[i][j];
            }
            sumRow[i] = sum;
            for(int[]row : matrix){
                for (int elem : row){
                    System.out.println(elem + " ");
                }
                System.out.println();
            }
        }
    }
}