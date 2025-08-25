import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class LottoGenerator {

    public Set<Integer> generate() {
        Set<Integer> numbers = new HashSet<>();
        while(numbers.size() < 6){
            numbers.add(ThreadLocalRandom.current().nextInt(1, 46));
        }
        return numbers;
    }

}
