package buem.pro.mycourseproject.repositroy.product;

import buem.pro.mycourseproject.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ProductMongoRepository extends MongoRepository<Product, String> {
    List<Product> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
