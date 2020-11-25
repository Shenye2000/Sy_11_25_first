package cn.bdqn.utils;

public class singleton {
    private  static  singleton sg;

    private  singleton(){

    }



    public  singleton getSingleton(){

        return  new singleton();
    }
}
