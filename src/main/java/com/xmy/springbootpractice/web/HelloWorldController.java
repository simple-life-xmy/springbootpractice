package com.xmy.springbootpractice.web;

import com.xmy.springbootpractice.domain.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello")
    public String sayHello(String name){
        return "Hello World, " + name;
    }

    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setName("小明");
        user.setAge(12);
        user.setPass("123456");
        return user;
    }

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users=new ArrayList<User>();
        User user1=new User();
        user1.setName("neo");
        user1.setAge(30);
        user1.setPass("neo123");
        users.add(user1);
        User user2=new User();
        user2.setName("小明");
        user2.setAge(12);
        user2.setPass("123456");
        users.add(user2);
        return users;
    }

    /**
     * 地址栏传参
     * 访问：http://localhost:8080/get/neo
     * 返回：{"name":"neo","age":0,"pass":null}
     * @param name
     * @return
     */
    @RequestMapping(value="get/{name}", method=RequestMethod.GET)
    public User get(@PathVariable String name) {
        User user=new User();
        user.setName(name);
        return user;
    }

    /**
     * 参数校验-Spring Boot 的参数校验其实是依赖于 hibernate-validator 来进行
     * @param user
     * @param result
     */
    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user, BindingResult result) {
        System.out.println("user:"+user);
        if(result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode() + "-" + error.getDefaultMessage());
            }
        }
    }

}
