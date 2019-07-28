package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        NumberHandler numberHandler = context.getBean("someNumHandler",NumberHandler.class);
        numberHandler.printnNum();
        System.out.println("Num product is "+numberHandler.numProduct());
    }
}
