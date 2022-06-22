package example.commands;

public class Mod implements Command {
    @Override
    public String getName() {
        return "mod";
    }

    @Override
    public int exec(int a, int b) {
        return a % b;
    }
}
