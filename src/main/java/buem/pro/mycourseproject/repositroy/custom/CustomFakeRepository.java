package buem.pro.mycourseproject.repositroy.custom;

import buem.pro.mycourseproject.model.Custom;
import buem.pro.mycourseproject.model.Customer;
import buem.pro.mycourseproject.model.Product;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class CustomFakeRepository {

    Customer customer;
    Product product;
    private LocalDateTime now = LocalDateTime.now();

    private List<Custom> customs = new ArrayList(
            Arrays.asList(
                    new Custom(product, customer,"1", 1, now, now),
                    new Custom(product, customer,"2", 2, now, now),
                    new Custom(product, customer,"3", 3, now, now)
            )
    );
    public List<Custom> findAll(){return this.customs;}

    public Custom findById(String id){
        return customs.stream().filter(custom -> custom.getId().equals(id)).findFirst().orElse(null);
    }

    public Custom update(Custom custom){
        this.deleteById(custom.getId());
        custom.setUpdatedAt(LocalDateTime.now());
        this.customs.add(custom);
        return custom;
    }
    public void deleteById(String id){
        Custom custom = this.findById(id);
        this.customs.remove(custom);
    }

    public Custom save(Custom custom){
        custom.setId(UUID.randomUUID().toString());
        custom.setCreatedAt(LocalDateTime.now());
        customs.add(custom);
        return custom;
    }

}
