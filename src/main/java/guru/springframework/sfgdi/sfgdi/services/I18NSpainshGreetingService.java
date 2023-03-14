package guru.springframework.sfgdi.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18NSpainshGreetingService implements GreetingService{
    @Override
    public String seyGreeting() {
        return "Hola ES";
    }
}
