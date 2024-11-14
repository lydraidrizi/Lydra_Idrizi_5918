public class Bird implements Animal{
    @Override
    void move(){
        System.out.println("Bird flies in the sky")
    }
    @Override
    void sleep(){
        System.out.println("The bird sleeps on branch")
    }
    @Override
    void sound(){
        System.out.println("Bird sings!")
    }
}
