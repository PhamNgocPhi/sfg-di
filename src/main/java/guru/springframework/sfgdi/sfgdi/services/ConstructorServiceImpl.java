package guru.springframework.sfgdi.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorServiceImpl implements GreetingService{
    @Override
    public String seyGreeting() {
        return "Hello World - Constructor";
    }
}
