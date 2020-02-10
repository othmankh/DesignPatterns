package Buttons;

public class WebButton implements Button {

    @Override
    public void render() {
        System.out.println("I am rendered as a web button!");
    }

    @Override
    public void onClick() {
        System.out.println("I am clicked as a web button!");
    }

}
