package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.bean.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
