package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.bean.Ingredient;

/**
 * 扩展CrudRepository接口，第一个参数是repository要持久化的实体类型，第二个参数是实体ID属性的类型
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
