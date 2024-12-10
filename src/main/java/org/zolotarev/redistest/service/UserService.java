package org.zolotarev.redistest.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.zolotarev.redistest.entity.User;
import org.zolotarev.redistest.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user){
        return userRepository.save(user);
    }

    @Cacheable(value = "users", key = "#id")
    public User getById(Integer id){
        return userRepository.findById(id).orElse(null);
    }

}
