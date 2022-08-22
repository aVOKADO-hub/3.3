import java.util.Comparator;
import java.util.List;


public class AnimalByAgeComparator implements Comparator<PatAnimal> {
    private Order order;

    public AnimalByAgeComparator(Order order, List<PatAnimal> petAnimals) {
        switch (order){
            case ASCENDING -> compareAscending(petAnimals);
            case DESCENDING -> compareDescending(petAnimals);
        }
    }


    public List<PatAnimal> compareAscending(List<PatAnimal>animals) {
        for(int i = 0 ; i< animals.size();i++){
            for(int j= 0 ; j< animals.size();j++){
                if (animals.get(i).getAge()<animals.get(j).getAge()){
                    PatAnimal tmp = animals.get(i);
                    animals.set(i,animals.get(j));
                    animals.set(j,tmp);
                }
            }
        }
        return animals;
    }
    public List<PatAnimal> compareDescending(List<PatAnimal>animals) {
        for(int i = 0 ; i< animals.size();i++){
            for(int j= 0 ; j< animals.size();j++){
                if (animals.get(i).getAge()>animals.get(j).getAge()){
                    PatAnimal tmp = animals.get(i);
                    animals.set(i,animals.get(j));
                    animals.set(j,tmp);
                }
            }
        }
        return animals;
    }

    @Override
    public int compare(PatAnimal o1, PatAnimal o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
