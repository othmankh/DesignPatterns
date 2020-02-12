import Buttons.Button;
import Factories.DialogFactory;
import Factories.WebDialogFactory;
import TextBoxes.TextBox;

public class Main {

    public static void main(String[] args) {

        DialogFactory webDialogFactory = new WebDialogFactory();
        Button button = webDialogFactory.createButton();
        button.render();

        TextBox webTextBox = webDialogFactory.createTextBox();
        webTextBox.render();
        webTextBox.setText("Hello!");

    }
}
