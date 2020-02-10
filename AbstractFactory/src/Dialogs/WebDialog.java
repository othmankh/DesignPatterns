package Dialogs;

import Buttons.Button;
import Buttons.WebButton;

public class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WebButton();
    }
}