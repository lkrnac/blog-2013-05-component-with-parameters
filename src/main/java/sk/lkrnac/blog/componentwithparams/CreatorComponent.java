package sk.lkrnac.blog.componentwithparams;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class CreatorComponent implements ApplicationContextAware{
	ApplicationContext context;
	
	public void createComponentWithParam(String param1, int param2){
		ComponentWithParams component = (ComponentWithParams)
				context.getBean(SpringConstants.COMPONENT_WITH_PARAMS, 
						param1, param2);
		System.out.println(component.toString() + " instanciated...");
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
	}
}
