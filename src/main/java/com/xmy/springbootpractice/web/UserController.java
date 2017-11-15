package com.xmy.springbootpractice.web;

import com.xmy.springbootpractice.domain.User;
import com.xmy.springbootpractice.repository.UserMapper;
import com.xmy.springbootpractice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xmy
 */
@RestController
public class UserController {

    @Resource
    IUserService userService;

    @RequestMapping("/user/get")
    public User getUser(Long id) {
        return userService.get(id);
    }

    @RequestMapping("/user/all")
    public List<User> listUser() {
        return userService.list();
    }

}
