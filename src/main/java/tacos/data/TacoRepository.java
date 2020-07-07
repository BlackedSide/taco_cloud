package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.bean.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
