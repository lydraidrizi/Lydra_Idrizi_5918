
public class Main {
    public static void main(String[] args) {

     Animal[] animals = new Animal [5];

     animals[0] = new Dog(name:"Jerry");
     animals[1] = new Lion(name:"Toby");
     animals[2] = new Frog(name:"Tommy");
     animals[3] = new SaraMountainDog(name:"Sara");
     animals[4] = new Animal(name:"Any Animal");

     for(Animal animal : animals){
         animal.onomatopie();
         if(animal instanceof SaraMountainDog){
             ((SaraMountainDog)animals)
         }

     }

    }
}