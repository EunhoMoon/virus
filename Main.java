import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var covid = new Covid19();
        var cold = new CommonCold();

        List<String> mySymptoms = new ArrayList<>();
        mySymptoms.addAll(covid.getSymptoms());
        mySymptoms.addAll(cold.getSymptoms());

        mySymptoms.stream().distinct().forEach(System.out::println);
        
    }
    
}
