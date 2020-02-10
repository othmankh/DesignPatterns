package TextBoxes;

public class WebTextBox extends TextBox {

    @Override
    public void render() {
        System.out.print("I am web text box !");
    }

    @Override
    public void setText(String text) {
        super.setText(text);
        System.out.print("I am setting web text box with " + text);
    }
}
