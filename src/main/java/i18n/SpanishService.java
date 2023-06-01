package i18n;

import com.example.DItutorialYOTPO.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpanishService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Holle YO commo es tas?";
    }
}
