package com.deeptech.spring1;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
public class SprintTest {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("ApplicationContext.xml");// Bean - classname and passing id
		BeanFactory ft =new XmlBeanFactory(res);
		Student s =(Student) ft.getBean("stu");
		s.display();
	}

}
