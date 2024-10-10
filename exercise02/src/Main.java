import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        Random random_generator = new Random();

        for(int i = 0 ; i < 3; i++){
            for(int j = 0; j<3; j++){
                x = random_generator.nextInt(101);
                if(x% 2 == 0){
                    arr[i][j] = "X";

                }else{
                    arr[i][j] = "O";

                }
            }
        }
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i< 3; i++){
            for(int j = 0; j < 3; j++) {
                if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
                    System.out.println("The winner is" + arr[i][0]);
                    break;
                }
                if (arr[0][j] == arr[1][j] && arr[1][j] == arr[2][j]) {
                    System.out.println("The winner is" + arr[0][j]);
                    break;
                }
                if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
                    System.out.println("The winner is" + arr[0][0]);
                    break;
                }
                if (arr[0][2] == arr[1][1] && arr[1][1] == arr[0][2]) {
                    System.out.println("The winner is" + arr[0][2]);
                    break;
                }
                System.out.println("The game is a draw")}

