package SpringBoot.FirstProject.dao;



import SpringBoot.FirstProject.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   void update(User user);
   void delete(long id);
   void insertDataWithHQL();
   User findById(long id);
}
