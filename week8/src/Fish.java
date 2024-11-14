public class Fish implements Animal{
    @Override
    void move(){
        System.out.println("The fish swims in the sea")
    }
    @Override
    void sleep(){
        System.out.println("The fish rests deep in the water")
    }
    @Override
    void sound(){
        System.out.println("Fish bubbling")
    }
}

