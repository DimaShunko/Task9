package example;

public class Div implements Command {
    @Override
    public String getName() {
        return "div";
    }

    @Override
    public int exec(int a, int b) {
        return a / b;
    }
}
