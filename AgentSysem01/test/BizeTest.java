import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BizeTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext-dafault.xml");
		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}

	}

}
