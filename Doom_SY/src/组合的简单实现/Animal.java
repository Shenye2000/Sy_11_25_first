package 组合的简单实现;

public class Animal {

    private void beat(){
        System.out.println("心脏跳动");
    }

    public  void breathe(){
        System.out.println("呼吸");
        beat();
    }
}
