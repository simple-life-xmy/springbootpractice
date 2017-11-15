package com.xmy.springbootpractice;

import com.xmy.springbootpractice.domain.User;
import com.xmy.springbootpractice.repository.UserMapper;
import com.xmy.springbootpractice.web.HelloWorldController;
import com.xmy.springbootpractice.web.UserController;
import net.minidev.json.JSONUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.annotation.Resource;

import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
public class UserTest {

//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() throws Exception {
//        mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
//    }
//
//    @Test
//    public void getUser() throws Exception {
//        Long id = 1L;
//        mockMvc.perform(MockMvcRequestBuilders.get("/user/get?id=1")).andDo(print());
//    }
//
//    @Test
//    public void getUsers() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.post("/user/all")).andDo(print());
//    }

    @Resource
    UserMapper userMapper;

    @Test
    public void testUser()  {

        //查询
        List<User> users = userMapper.all();
        System.out.println("users = "+users.toString());
//        User user = userMapper.get(1l);
//        System.out.println("user = "+ user.toString());
    }


}
