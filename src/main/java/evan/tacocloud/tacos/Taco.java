package evan.tacocloud.tacos;

import com.datastax.oss.driver.api.core.uuid.Uuids;
import lombok.Data;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;


//import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
//@Table
//@Entity
@Table("tacos") //持久化到 tacos 表中
public class Taco {

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
//    @ManyToMany
    @Column("ingredients")
    private List<Ingredient> ingredients = new ArrayList<>();

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)//定義分區鍵
    private UUID id =Uuids.timeBased();

    @PrimaryKeyColumn(type = PrimaryKeyType.CLUSTERED,
                        ordering = Ordering.DESCENDING)//定義集群鍵
    private Date createdAt = new Date();

    public void addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }
}
