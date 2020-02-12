import Dialogs.Dialog;
import Dialogs.WebDialog;
import Dialogs.WindowsDialog;

public class Main {

    public static void main(String[] args) {

        Dialog webDialog = new WebDialog();
        webDialog.render();

        Dialog windowsDialog = new WindowsDialog();
        windowsDialog.render();


    }
}
