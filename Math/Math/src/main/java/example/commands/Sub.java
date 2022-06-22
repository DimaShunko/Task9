package example.commands;

public class Sub implements Command {
    @Override
    public String getName() {
        return "sub";
    }

    @Override
    public int exec(int a, int b) {
        return a-b;
    }
}
