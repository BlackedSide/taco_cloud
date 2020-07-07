package tacos.bean;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // 依赖数据库自动生成ID值
    private Long id;

    private Date createdAt;

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @ManyToMany(targetEntity = Ingredient.class) // 声明Taco与关联的Ingredient列表之间的多对多关系（每个Taco可以有多个Ingredient，而每个Ingredient可以是多个Taco的组成部分）
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

    @PrePersist // 在Taco持久化之前，使用该方法将createAt属性设置为当前的日期和时间
    void createdAt() {
        this.createdAt = new Date();
    }
}
