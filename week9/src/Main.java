
import java.lang.reflect.Method;


interface GreetingService {
    void greet(String name);
}


class EnglishGreetingService implements GreetingService {
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}


class SpanishGreetingService implements GreetingService {
    public void greet(String name) {
        System.out.println("¡Hola, " + name + "!");
    }
}


class IoCContainer {
    public GreetingService getGreetingService(String language) {
        try {

            Class<?> clazz = Class.forName(language);
            return (GreetingService) clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        IoCContainer container = new IoCContainer();


        GreetingService englishService = container.getGreetingService("EnglishGreetingService");

        if (englishService != null) {
            System.out.println("Using service: " + englishService.getClass().getSimpleName());
            try {
                Method method = englishService.getClass().getMethod("greet", String.class);
                method.invoke(englishService, "John");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        GreetingService spanishService = container.getGreetingService("SpanishGreetingService");
        if (spanishService != null) {
            System.out.println("Using service: " + spanishService.getClass().getSimpleName());
            try {
                Method method = spanishService.getClass().getMethod("greet", String.class);
                method.invoke(spanishService, "Juan");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}