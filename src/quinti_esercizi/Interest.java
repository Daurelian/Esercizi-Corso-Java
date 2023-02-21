package quinti_esercizi;

public class Interest {
    private int codex;
    private String text;

    public Interest(int codex, String text) {
        this.codex = codex;
        this.text = text;
    }

    public int getCodex() {
        return codex;
    }

    public void setCodex(int codex) {
        this.codex = codex;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString(){
        return this.getText();
    }
}
