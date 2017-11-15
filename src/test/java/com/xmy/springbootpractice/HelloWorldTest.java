package com.xmy.springbootpractice;

import com.xmy.springbootpractice.web.HelloWorldController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
public class HelloWorldTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }

    @Test
    public void getHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/hello?name=小明").accept(MediaType.APPLICATION_JSON_UTF8)).andDo(print());
    }

    @Test
    public void getUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/getUser")).andDo(print());
    }

    @Test
    public void getUsers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/getUsers")).andDo(print());
    }

    @Test
    public void saveUsers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/saveUser")
                .param("name","")
                .param("age","666")
                .param("pass","test")
        ).andDo(print());
    }


}
