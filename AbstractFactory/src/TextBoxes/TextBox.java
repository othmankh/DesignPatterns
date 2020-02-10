package TextBoxes;

public abstract class TextBox {

    private String text;

    public abstract void render();

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return  text;
    }
}
