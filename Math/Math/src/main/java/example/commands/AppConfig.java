package example.commands;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    Command getDate() {
        return new Sum();
    }

    @Bean
    Command getDir() {
        return new Sub();
    }

    @Bean
    Command getExit() {
        return new Mul();
    }

    @Bean
    Command getHelp() {
        return new Div();
    }

    @Bean
    Command getTime() {
        return new Mod();
    }
}
