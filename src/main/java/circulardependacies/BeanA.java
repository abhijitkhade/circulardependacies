package circulardependacies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
	
	BeanB B;


	@Autowired
	@Lazy
	public BeanA(BeanB b) {
		super();
		B = b;
	}
	
	public void doSomething() {
		
		
		System.out.println("Method of BeanA !!!");
		System.out.println("===================");
	}
	

	
}
