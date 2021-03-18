package app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Dog extends Animal{
    @Override
    public String toString() {
        return "woof";
    }
}
