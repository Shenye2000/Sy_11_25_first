package cn.bdqn.Text;

/*import org.apache.ibatis.session.SqlSession;*/
import cn.bdqn.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class SpringText {


 @Test
    public  void Text(){
     ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
     Student student =(Student) applicationContext.getBean("student");
     Student student2 =(Student) applicationContext.getBean("student");
     System.out.println(student);
     System.out.println(student2);
     System.out.println(student2==student);
     ((ClassPathXmlApplicationContext) applicationContext).close();
    }

    @Test
    public  void Text1(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
        Student student =(Student) applicationContext.getBean("student");
        System.out.println(student);
    }
}
