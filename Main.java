import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var covid = new Covid19();
        var cold = new CommonCold();

        Human poorHuman = new Human();

        poorHuman.infection(covid, cold);
        poorHuman.whereDoesItHurt();
    }

}
