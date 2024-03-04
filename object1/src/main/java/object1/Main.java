package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("Andy", 50, 100);
        System.out.println(person1.height);

        Person[] people = new Person[2];
        people[1] = person1;

        System.out.println(people[1].age); //specific






        Dog[] dogs = new Dog[7];
        Chair[] chairs = new Chair[10];
        Car[] cars = new Car[5];

        /*
        int[] num = {1,2,3,4};
        for (int x : num){
            System.out.println(x);
            */

        }


    }
}
