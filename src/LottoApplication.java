import java.util.*;

public class LottoApplication {

    private static final List<Set<Integer>> lottoHistory = new ArrayList<>();

    public static void main(String[] args){

        LottoGenerator generator = new LottoGenerator();

        while(true){
            Set<Integer> lottoNumbers = generator.generate();
            System.out.println(lottoNumbers);

            if(lottoHistory.size() > 100)
                lottoHistory.clear();

            lottoHistory.add(lottoNumbers);
        }
    }


}
