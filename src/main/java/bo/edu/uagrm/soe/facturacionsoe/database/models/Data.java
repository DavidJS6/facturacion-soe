package bo.edu.uagrm.soe.facturacionsoe.database.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "data", schema = "public", catalog = "")
public class Data {
    private Long id;
    private String name;
    private Integer age;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(id, data.id) &&
                Objects.equals(name, data.name) &&
                Objects.equals(age, data.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
