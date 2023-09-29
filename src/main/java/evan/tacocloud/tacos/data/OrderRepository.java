package evan.tacocloud.tacos.data;

import evan.tacocloud.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder,String> {

    TacoOrder save(TacoOrder order);
}
