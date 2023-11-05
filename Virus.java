import java.util.List;

class Virus {

    private String name;

    private List<String> symptoms;

    public String getName() {
        return this.name;
    }

    public List<String> getSymptoms() {
        return this.symptoms;
    }

    public Virus(
        String name,
        List<String> symptoms
    ){
        this.name = name;
        this.symptoms = symptoms;
    }
    
}