package example;

public class Mul implements Command {
    @Override
    public String getName() {
        return "mul";
    }

    @Override
    public int exec(int a, int b) {
        return a * b;
    }
}
