package english.grammar.app.Models;

public class TensesExampleModel {

    private String id, englishexample;

    public TensesExampleModel() {
    }

    public TensesExampleModel(String id, String englishexample) {
        this.id = id;

        this.englishexample = englishexample;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnglishexample() {
        return englishexample;
    }

    public void setEnglishexample(String englishexample) {
        this.englishexample = englishexample;
    }
}
