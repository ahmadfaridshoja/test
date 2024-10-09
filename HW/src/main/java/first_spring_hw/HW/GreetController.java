package first_spring_hw.HW;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @GetMapping(path="/Greet")
    public String HW(){
        return "hello "+" Ahmad Farid Shoja";
    }
    @GetMapping(path="/howareyou")
    public String hru(){
        return "how are you";
    }
    @GetMapping(path="iamfinethanks")
    public String IFT(){
        return "I am fine, Thanks";
    }
}
