package com.ventura;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

	
	
	 @Override
	    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

	        if(bean instanceof DemoCicloVidaBean){
	            ((DemoCicloVidaBean) bean).beforeInit();
	        }

	        return bean;
	    }

	    @Override
	    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	        if(bean instanceof DemoCicloVidaBean){
	            ((DemoCicloVidaBean) bean).afterInit();
	        }

	        return bean;
	    }
}
