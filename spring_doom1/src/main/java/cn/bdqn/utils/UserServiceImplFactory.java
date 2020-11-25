package cn.bdqn.utils;

import cn.bdqn.domain.Student;

public class UserServiceImplFactory {


    public Student createUserService(){
        return new Student();
    }
    public static Student createUserServiceTwo(){
        return new Student();
    }
}
