public class Main {
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("John Doe", 30);

        // Serialize the Person object
        SerializePerson.serializePerson(person);

        // Deserialize the Person object
        Person deserializedPerson = DeserializePerson.deserializePerson();
    }
}