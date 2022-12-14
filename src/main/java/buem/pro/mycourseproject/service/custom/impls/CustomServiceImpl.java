package buem.pro.mycourseproject.service.custom.impls;

import buem.pro.mycourseproject.model.Custom;

import buem.pro.mycourseproject.repositroy.custom.CustomFakeRepository;
import buem.pro.mycourseproject.repositroy.custom.CustomMongoRepository;

import buem.pro.mycourseproject.service.custom.interfaces.ICustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import java.util.List;

@Service
public class CustomServiceImpl implements ICustomService {

    @Autowired
    CustomMongoRepository repository;

    @PostConstruct
    void init(){

    }

    @Override
    public Custom create(Custom custom) {
        return repository.save(custom);
    }

    @Override
    public Custom update(Custom custom) {
        return repository.save(custom);
    }

    @Override
    public Custom get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Custom> getAll() {
        return repository.findAll();
    }
}
