package evan.tacocloud.tacos.data;

import evan.tacocloud.tacos.Taco;
import org.springframework.data.repository.CrudRepository;


public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}