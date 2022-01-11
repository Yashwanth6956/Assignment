package com.te.springLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component

public class Demo implements InitializingBean, DisposableBean {

	Demo() {
		System.out.println("the bean is instantiated ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("initialization is done ");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroyed successfully");
	}

	public void name() {
		System.out.println("perform operation");
	}

}
