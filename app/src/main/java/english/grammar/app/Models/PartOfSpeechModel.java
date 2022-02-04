package english.grammar.app.Models;

public class PartOfSpeechModel {

    private String id, name_eng, def_eng, eg_eng;

    public PartOfSpeechModel() {
    }

    public PartOfSpeechModel(String id, String name_eng, String def_eng, String eg_eng) {
        this.id = id;
        this.name_eng = name_eng;
        this.def_eng = def_eng;
        this.eg_eng = eg_eng;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName_eng() {
        return name_eng;
    }

    public void setName_eng(String name_eng) {
        this.name_eng = name_eng;
    }


    public String getDef_eng() {
        return def_eng;
    }

    public void setDef_eng(String def_eng) {
        this.def_eng = def_eng;
    }


    public String getEg_eng() {
        return eg_eng;
    }

    public void setEg_eng(String eg_eng) {
        this.eg_eng = eg_eng;
    }
}
