public class Lion implements Animal{

    @Override
    public void move(){
        System.out.println("The lion moves gracefully in the savannah")
    }
    @Override
    public void sleep(){
        System.out.println("The lion sleeps")
    }
    @Override
    public void sound(){
        System.out.println("Lion roars!")
    }
}
