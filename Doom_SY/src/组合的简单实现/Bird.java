package 组合的简单实现;

public class Bird {
    private  Animal animal;

    public  Bird(Animal animal){
         this.animal=animal;
    }
    public  void  Breathe(){
        animal.breathe();
    }
    public  void fly(){
        System.out.println("小鸟在天空飞翔");
        Breathe();
    }
}
