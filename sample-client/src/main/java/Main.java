import io.github.zerosum.Greeting;
import io.github.zerosum.Person;

public class Main {
    public static void main(String args[]) {
        Person jane = new Person("Jane", "Doe");
        Person john = new Person("John", "Doe");

        new Greeting("Nice to meet you.", jane.getFirstName(), john.getFirstName()).greet();
    }
}
