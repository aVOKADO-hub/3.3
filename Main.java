import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Cat tom = new Cat("tom",2008);
        Cat murca = new Cat("murca",2014);
        Cat murzic = new Cat("murzic",2012);
        List<Cat> cats = new ArrayList<>(List.of(tom,murca,murzic));
        Collections.sort(cats);
        for (Cat cat:cats) {
            System.out.println(cat);
        }

        Dog shuric = new Dog("shuric",2017);
        Dog zver = new Dog("zver",2013);
        Dog luna = new Dog("luna",2019);
        List<Dog> dogs = new ArrayList<>(List.of(shuric,zver,luna));
        Collections.sort(dogs);
        for (Dog dog:dogs) {
            System.out.println(dog);
        }

        List<PatAnimal> rancho = new ArrayList<>();
        rancho.addAll(cats);
        rancho.addAll(dogs);
        rancho.sort(new AnimalByAgeComparator(Order.DESCENDING,rancho));

        for (PatAnimal animal: rancho){
            System.out.println(animal.getName() + " " + animal.getAge()+" years");
        }

    }
}
