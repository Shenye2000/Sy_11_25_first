package treesetAndHashset.domain;

import java.util.Objects;

public class Dog {
    Integer id;
    String name;

    @Override
    public boolean equals(Object o) {

        return Objects.equals(id, (1)) &&
                Objects.equals(name, "哈士奇");
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
