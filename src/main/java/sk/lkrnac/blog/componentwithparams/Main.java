package sk.lkrnac.blog.componentwithparams;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringContext.class);
		CreatorComponent invoker = context.getBean(CreatorComponent.class);
		
		invoker.createComponentWithParam("Fisrt", 1);
		invoker.createComponentWithParam("Second", 2);
		invoker.createComponentWithParam("Third", 3);
		context.close();
	}
}
