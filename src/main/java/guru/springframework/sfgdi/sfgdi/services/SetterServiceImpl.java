package guru.springframework.sfgdi.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterServiceImpl implements GreetingService{
    @Override
    public String seyGreeting() {
        return "Hello World - Setter";
    }
}
