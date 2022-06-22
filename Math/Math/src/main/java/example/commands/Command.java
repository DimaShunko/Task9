package example.commands;

public interface Command {
    String getName();

    int exec(int a, int b);
}
