import java.util.Objects;
import java.util.Random;

public class Cat extends PatAnimal implements Comparable<Cat>{
    public Integer caughtMiceCount;

    public Cat(String name, Integer yearOfBirth) {
        super(name, yearOfBirth);
    }
    {
        caughtMiceCount = new Random().nextInt(getAge()*getAge())+1;
    }
    @Override
    public void sleep() {
        System.out.println( this.name+" is sleeping now");
    }
    @Override
    public void makeSound() {
        System.out.println(this.name+" say MEOW");
    }
    @Override
    public int compareTo(Cat o) {
        return this.caughtMiceCount.compareTo(o.caughtMiceCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(caughtMiceCount, cat.caughtMiceCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caughtMiceCount);
    }

    @Override
    public String toString() {
        return this.name+" caught "+caughtMiceCount+" mices";
    }

}
