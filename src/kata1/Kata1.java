package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Laura", new Date (96,9,22));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}
