package melihvarilci.northwind.business.abstracts;

import melihvarilci.northwind.core.entities.User;
import melihvarilci.northwind.core.utilities.results.DataResult;
import melihvarilci.northwind.core.utilities.results.Result;

public interface UserService {
    Result add(User user);

    DataResult<User> findByEmail(String email);
}
