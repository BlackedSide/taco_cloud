package tacos.data;

import tacos.bean.Order;

public interface OrderRepository {
    Order save(Order order);
}
