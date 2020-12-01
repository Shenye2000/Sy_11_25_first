package treesetAndHashset;

import treesetAndHashset.domain.Dog;

import java.util.HashSet;

public class hashset {


     public static void main(String[] args) {

          HashSet<Dog> dogs=new HashSet<>();
          Dog hsq=new Dog();
          hsq.setName("哈士奇");
          hsq.setId(1);

          Dog jinmao=new Dog();
          jinmao.setId(2);
          jinmao.setName("金毛");

          dogs.add(hsq);
          dogs.add(jinmao);

          dogs.forEach(System.out::println);
          System.out.println(hsq==jinmao);
         System.out.println(hsq.equals(jinmao));
     }

}
