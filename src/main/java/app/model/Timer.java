package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
public class Timer {

    private Long nanoTime = System.nanoTime();
    public Long getTime() {
        return nanoTime;
    }
}
