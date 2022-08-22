import java.time.LocalDate;
import java.util.Locale;

public abstract class PatAnimal {
    public String name;
    public LocalDate yearOfBirth;

    public PatAnimal(String name, Integer yearOfBirth) {
        this.name = name;
        this.yearOfBirth = LocalDate.of(yearOfBirth,1,1);
    }
    public int getAge(){
        int nowTime= LocalDate.now().getYear();
        int diff = nowTime-this.yearOfBirth.getYear();
        return diff;
    }
    public String getName(){
        return this.name;
    }
    public abstract void sleep();
    public abstract void makeSound();
}
