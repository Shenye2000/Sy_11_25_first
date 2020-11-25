package cn.bdqn.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private  long id;
    private  String name;
    private  Integer age;
    private   String sex;
    private Date date;
    private  car car_;

    public   void init(){
        System.out.println("对象存活");
    }
    public  void destroy(){
        System.out.println("对象死亡");
    }



}
