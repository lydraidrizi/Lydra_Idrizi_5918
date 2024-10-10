//
public class Main {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            if(1%2==0){

               continue;
            }
            if(i==7){
                break;
            }
            System.out.println("The odd number is"+i);
        }

    }
}