import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.assignment2.Salary;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("assig.xml");
		Salary bean = applicationContext.getBean(Salary.class);
		System.out.println(bean);
	}

}
