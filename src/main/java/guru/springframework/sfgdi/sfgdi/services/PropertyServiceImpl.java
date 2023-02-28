package guru.springframework.sfgdi.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements GreetingService {
    @Override
    public String seyGreeting() {
        return "Hello World - property";
    }
}
