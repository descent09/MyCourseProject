package buem.pro.mycourseproject.repositroy.customer;

import buem.pro.mycourseproject.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CustomerMongoRepository extends MongoRepository<Customer, String> {
    List<Customer> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
