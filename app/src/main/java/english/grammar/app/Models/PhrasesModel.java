package english.grammar.app.Models;

public class PhrasesModel {

    private String id, eng_phrase;

    public PhrasesModel() {
    }

    public PhrasesModel(String id, String eng_phrase) {
        this.id = id;
        this.eng_phrase = eng_phrase;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEng_phrase() {
        return eng_phrase;
    }

    public void setEng_phrase(String eng_phrase) {
        this.eng_phrase = eng_phrase;
    }

}
