package evan.tacocloud.tacos.data;

import evan.tacocloud.tacos.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
