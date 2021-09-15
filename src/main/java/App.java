import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld myBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(myBean.getMessage());

        Cat catBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getName());

        Cat newCatBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(newCatBean.getName());

        System.out.println(bean == myBean);
        System.out.println(catBean == newCatBean);

    }
}