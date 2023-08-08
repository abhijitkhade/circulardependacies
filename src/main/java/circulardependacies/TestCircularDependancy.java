package circulardependacies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCircularDependancy {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigA.class);
	
	BeanA a= context.getBean(BeanA.class);
	
	System.out.println(a);
	
	a.doSomething();
	
	
	BeanB b= context.getBean(BeanB.class);
	
	System.out.println(b);
	
	b.doSomething();

	}
}
