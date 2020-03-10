package com.hzj;

import com.hzj.services.Stu;
import com.hzj.services.StuServices;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        StuServices stuServicesImp = context.getBean("stuServicesImp", StuServices.class);
        StuServices stuServicesImp2 = context.getBean("stuServicesImp2", StuServices.class);

        stuServicesImp.findByAll();
        stuServicesImp2.findByAll();
    }
}
