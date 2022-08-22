import java.util.Objects;
import java.util.Random;

public class Dog extends PatAnimal implements Comparable<Dog>{
    public Integer scaredOfThievesCount;
    public Dog(String name, Integer yearOfBirth) {
        super(name, yearOfBirth);
    }

    @Override
    public void sleep() {
        System.out.println(this.name+" doesn`t secure you from thieves");
    }

    @Override
    public void makeSound() {
        System.out.println(this.name+" say whoof");
    }

    {
        scaredOfThievesCount = new Random().nextInt(getAge()*getAge())+1;
    }
    @Override
    public int compareTo(Dog o) {
        return this.scaredOfThievesCount.compareTo(o.scaredOfThievesCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(scaredOfThievesCount, dog.scaredOfThievesCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scaredOfThievesCount);
    }

    @Override
    public String toString() {
        return this.name+" scared "+scaredOfThievesCount+" thieves";
    }


}
