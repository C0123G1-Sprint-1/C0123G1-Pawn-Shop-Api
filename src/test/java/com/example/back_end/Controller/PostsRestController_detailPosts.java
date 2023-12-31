package com.example.back_end.Controller;

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
public class PostsRestController_detailPosts {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void detailPosts_1() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/posts/detailPosts/{id}", "null"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    /**
     * GET có tham số id = null
     *
     * @throws Exception
     */

    @Test
    public void detailPosts_2() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/posts/detailPosts/{id}", ""))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    /**
     * GET có tham số id rỗng
     *
     * @throws Exception
     */

    @Test
    public void detailPosts_3() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/posts/detailPosts/{id}", "15"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    /**
     * GET có tham số id không tồn tại trong Database
     *
     * @throws Exception
     */

    @Test
    public void detailPosts_4() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/posts/detailPosts/{id}", "11"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
    /**
     * GET có tham số id tồn tại trong Database
     *
     * @throws Exception
     */
}
