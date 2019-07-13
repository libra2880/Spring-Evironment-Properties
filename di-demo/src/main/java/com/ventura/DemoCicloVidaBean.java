package com.ventura;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class DemoCicloVidaBean implements InitializingBean, DisposableBean,BeanNameAware,
 BeanFactoryAware,ApplicationContextAware{

	
	
	public DemoCicloVidaBean() {
		System.out.println("# I'm in Demo ciclo vida bean Constructor");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## El Ciclo de Vida del been ha sido Terminado");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	
		System.out.println("## El Ciclo de Vida del Bean tiene sus propiedades establecidad");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	
		System.out.println("##  Aplicacion del contexto se ha establecido");
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		System.out.println("## La Fabrica del Bean se ha establecido");
		
	}

	@Override
	public void setBeanName(String name) {
	
		System.out.println("## My nombre Bean es" + name);
		
	}
	
		@PostConstruct
	    public void postConstruct(){
	        System.out.println("## El método anotado Post Constructor ha sido llamado ");
	    }

	    @PreDestroy
	    public void preDestroy() {
	        System.out.println("## El método anotado Predestroy ha sido llamado");
	    }

	    public void beforeInit(){
	        System.out.println("## - Antes de Init - Llamado por Bean Post Processor");
	    }

	    public void afterInit(){
	        System.out.println("## - Después de init llamado por Bean Post Processor");
	    }

}
