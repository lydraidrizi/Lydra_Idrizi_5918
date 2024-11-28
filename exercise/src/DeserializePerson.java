import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePerson {
    public static Person deserializePerson() {
        Person person = null;
        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            person = (Person) in.readObject();
            System.out.println("Deserialized Person: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }
}