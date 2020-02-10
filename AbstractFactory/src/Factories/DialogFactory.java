package Factories;

import Buttons.Button;
import TextBoxes.TextBox;

public interface DialogFactory {

    Button createButton();

    TextBox createTextBox();
}
