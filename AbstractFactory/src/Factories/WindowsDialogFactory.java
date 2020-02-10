package Factories;

import Buttons.Button;
import Buttons.WindowsButton;
import TextBoxes.TextBox;
import TextBoxes.WindowsTextBox;

public class WindowsDialogFactory implements DialogFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
