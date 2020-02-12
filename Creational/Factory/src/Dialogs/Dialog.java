package Dialogs;

import Buttons.Button;

public abstract class Dialog {

    abstract Button createButton();

    public void render() {
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
}
