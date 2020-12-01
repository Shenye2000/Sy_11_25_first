package treesetAndHashset;

import treesetAndHashset.domain.Dog;
import treesetAndHashset.moshi.MyComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeset {


    public  static  void main(String[] orgs){
           Set sets=new TreeSet(new MyComparator());
        Dog hsq=new Dog();
        hsq.setName("哈士奇2");
        hsq.setId(1);
        Dog jinmao=new Dog();
        jinmao.setId(2);
        jinmao.setName("金毛2");

        sets.add(hsq);
        sets.add(jinmao);
        sets.forEach(System.out::println);
    }
}
