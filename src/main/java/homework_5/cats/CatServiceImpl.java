package homework_5.cats;



import java.util.List;
import java.util.Random;

public class CatServiceImpl implements CatService {
    public List<Cat> eat(List<Cat> cats) {
        Random random = new Random();

        for (Cat cat : cats) {
            cat.setAddress(cat.getAddress() + " " + (1 + random.nextInt(100)));
        }
        return cats;
    }
}
