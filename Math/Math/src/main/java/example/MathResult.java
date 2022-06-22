package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class MathResult {
    @Autowired
    private Set<Command> commands;

    @RequestMapping("/math")
    public GettingResult getResult(@RequestParam(value = "command", defaultValue = "null") String cmd, @RequestParam(value = "a", defaultValue = "null") String a, @RequestParam(value = "b", defaultValue = "null") String b) {
        String regex = "[0-9]+";
        if (a.matches(regex) & b.matches(regex)) {
            for (Command command : commands) {
                if (command.getName().contentEquals(cmd)) {
                    return new GettingResult(cmd, a, b, command.exec(Integer.valueOf(a), Integer.parseInt(b)));
                }
            }
        }
        return new GettingResult(cmd, a, b, "Такой команды нет или параметры отсутсвуют");

    }
}
