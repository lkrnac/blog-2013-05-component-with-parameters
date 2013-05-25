package sk.lkrnac.blog.componentwithparams;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(SpringConstants.COMPONENT_WITH_PARAMS)
@Scope("prototype")
public class ComponentWithParams {
	private String param1;
	private int param2;
	
	public ComponentWithParams(String param1, int param2) {
		this.param1 = param1;
		this.param2 = param2;
	}

	@Override
	public String toString() {
		return "ComponentWithParams [param1=" + param1 + ", param2=" + param2
				+ "]";
	}
}
