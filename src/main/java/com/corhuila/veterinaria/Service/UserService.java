package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.User;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IUserRepository;
import com.corhuila.veterinaria.IService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> implements IUserService {
    @Autowired
    private IUserRepository repository;
    @Override
    protected IBaseRepository<User, Long> getRepository() {
        return repository;
    }
}
