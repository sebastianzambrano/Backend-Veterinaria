package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.User;
import com.corhuila.veterinaria.IService.IUserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/user")
public class UserController extends BaseController<User, IUserService> {
    protected UserController(IUserService service) {
        super(service, "User");
    }
}
