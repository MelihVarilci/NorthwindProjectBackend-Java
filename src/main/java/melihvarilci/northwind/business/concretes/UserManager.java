package melihvarilci.northwind.business.concretes;

import melihvarilci.northwind.business.abstracts.UserService;
import melihvarilci.northwind.core.dataAccess.UserDao;
import melihvarilci.northwind.core.entities.User;
import melihvarilci.northwind.core.utilities.results.DataResult;
import melihvarilci.northwind.core.utilities.results.Result;
import melihvarilci.northwind.core.utilities.results.SuccessDataResult;
import melihvarilci.northwind.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi.");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email), "Kullanıcı bulundu.");
    }
}
