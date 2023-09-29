package evan.tacocloud.tacos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


//import javax.persistence.Entity;
//import javax.persistence.Id;

@Data
//@Table
//@Entity JPA
@Table ("ingredients")//cassandra
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Ingredient {

//    @Id //JPA
    @PrimaryKey
    private String id;
    private String name;
    private Type type;

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
