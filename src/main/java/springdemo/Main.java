package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
       Doctor doctor = context.getBean(Doctor.class);
 //      Doctor doctor1 = context.getBean(Doctor.class);
//       System.out.println(staff.getQualification());
       //Staff staff = context.getBean(Nurse.class);
        doctor.assist();
        doctor.setQualification("MBBS");
       // System.out.println(doctor);
       // System.out.println(doctor1);
    }
}

