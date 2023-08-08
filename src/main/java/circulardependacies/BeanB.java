package circulardependacies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
	
	BeanA A;

	@Autowired
	public BeanB(BeanA a) {
		super();
		A = a;
	}
	
	public void doSomething() {
		
		
		System.out.println("Method Of BeanB !!!");
		System.out.println("===================");
	}
	

}
