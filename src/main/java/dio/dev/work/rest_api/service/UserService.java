package dio.dev.work.rest_api.service;

import dio.dev.work.rest_api.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
