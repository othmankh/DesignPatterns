package Factories;

import Buttons.Button;
import Buttons.WebButton;
import TextBoxes.TextBox;
import TextBoxes.WebTextBox;

public class WebDialogFactory implements DialogFactory {
    @Override
    public Button createButton() {
        return new WebButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WebTextBox();
    }
}
