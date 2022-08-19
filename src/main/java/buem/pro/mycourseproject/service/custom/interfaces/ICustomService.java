package buem.pro.mycourseproject.service.custom.interfaces;

import buem.pro.mycourseproject.model.Custom;

import java.util.List;


public interface ICustomService {
    Custom create(Custom custom);
    Custom update(Custom custom);
    Custom get(String id);
    void delete(String id);
    List<Custom> getAll();
}
