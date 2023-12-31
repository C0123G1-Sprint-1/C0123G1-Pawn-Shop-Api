package com.example.back_end.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PostsRestController_searchPosts {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void searchPosts_1() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/posts/findPostsByName/{title}", (Object) null))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void searchPosts_2() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/posts/findPostsByName/{title}",""))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void searchPosts_3() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/posts/findPostsByName/?{title}","abcd"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void searchPosts_4() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/posts/findPostsByName/{title}","Dịch vụ"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
}
