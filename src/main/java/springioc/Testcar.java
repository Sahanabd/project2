package springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Testcar {
	public static void main(String[] args) {
//		ClassPathResource resource =new ClassPathResource("ioc.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(resource);
//		Car car=(Car) beanFactory.getBean("mycar");
//		car.carPlayer();
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc.xml");
		Car car=(Car) context.getBean("mycar");
		car.carPlayer();
//		
	}

}
