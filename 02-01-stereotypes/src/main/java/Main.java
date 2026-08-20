import com.plandoer.beans.Parrot;
import com.plandoer.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = new Parrot();
        p.setName("Polly");

        Supplier<Parrot> supplier = () -> p;
        context.registerBean("parrot1", Parrot.class, supplier);

        Parrot parrot = context.getBean("parrot1", Parrot.class);
        System.out.println(parrot.getName());
    }
}