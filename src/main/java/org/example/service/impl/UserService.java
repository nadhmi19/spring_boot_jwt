package org.example.service.impl;

import org.example.model.study.Course;
import org.example.repo.BaseRepository;
import org.example.service.CrudBaseService;
import org.example.utils.enums.ERole;
import org.example.model.User;
import org.example.repo.UserRepository;
import org.example.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  extends CrudBaseService<User> implements IUserService {

    private final UserRepository userRepository;

    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAllByRole(ERole role) {
        return userRepository.findUsersByRole(role);
    }

    @Override
    public BaseRepository<User> getRepository() {
        return userRepository;
    }
}
