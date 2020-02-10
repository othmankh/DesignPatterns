package Buttons;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("I am rendered as a windows button!");
    }

    @Override
    public void onClick() {
        System.out.println("I am clicked as a windows button!");
    }
}
