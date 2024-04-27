package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.Receipt;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Receipt, Integer> {

}
