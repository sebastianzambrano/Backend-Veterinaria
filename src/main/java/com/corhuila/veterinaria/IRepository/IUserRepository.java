package com.corhuila.veterinaria.IRepository;

import com.corhuila.veterinaria.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends IBaseRepository<User, Long>{
}
