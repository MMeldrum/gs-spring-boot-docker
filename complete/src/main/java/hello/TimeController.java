package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    @RequestMapping("/time")
    public Time greeting() {
        return new Time();
    }
}
