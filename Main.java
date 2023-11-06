public class Main {

    public static void main(String[] args) {

        var covid = new Covid19();
        var cold = new CommonCold();

        // healthyHuman is a healthy human
        Human healthyHuman = new Human();

        healthyHuman.whereDoesItHurt();

        // poorHuman is a human who is sick with Covid-19 and Common Cold
        Human poorHuman = new Human();

        poorHuman.infection(covid, cold);
        poorHuman.whereDoesItHurt();
    }

}
