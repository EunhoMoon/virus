import java.util.ArrayList;
import java.util.List;

class Human {

    private List<Virus> viruses = new ArrayList<>();

    private List<String> symptoms = new ArrayList<>();

    public void infection(Virus... viruses) {
        for (Virus virus : viruses) {
            this.viruses.add(virus);
            this.symptoms.addAll(virus.getSymptoms());
        }
        this.symptoms = this.symptoms.stream().distinct().toList();
    }   

    public void whereDoesItHurt() {
        if (this.viruses.size() == 0) {
            System.out.println("Healthy");
            return;
        }

        String hisSymptoms = "He is sick with:";
        for (String symptom : this.symptoms) {
            hisSymptoms += " [" + symptom + "]";
        }
        System.out.println(hisSymptoms);
    }

}
