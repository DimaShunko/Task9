package example.commands;

public class Sum implements Command {
    @Override
    public String getName() {
        return "sum";
    }

    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
