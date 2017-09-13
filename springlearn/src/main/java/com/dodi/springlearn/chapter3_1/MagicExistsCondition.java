package com.dodi.springlearn.chapter3_1;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {

	public boolean matches(ConditionContext context,
			AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		Environment env = context.getEnvironment();
		return env.containsProperty("magic");
	}

}
