package buem.pro.mycourseproject.repositroy.custom;

import buem.pro.mycourseproject.model.Custom;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CustomMongoRepository extends MongoRepository<Custom, String> {

    List<Custom> findAllByCreatedAtAfterAndId(LocalDateTime date, String id);
}
