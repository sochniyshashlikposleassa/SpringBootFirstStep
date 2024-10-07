package SpringBoot.FirstProject.service;



import SpringBoot.FirstProject.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void update(User user);

    void delete(long id);

    List<User> findAll();

    void insertDataWithHQL();

    User findById(long id);
}
