package web.service;

import web.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String name);
}
