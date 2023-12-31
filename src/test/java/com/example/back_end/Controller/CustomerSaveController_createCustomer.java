package com.example.back_end.controller;

import com.example.back_end.dto.CustomerSaveDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CustomerSaveController_createCustomer {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * Create by DatNT
     * Date create 14/07/2023
     * Test method create
     * @expect successful and status HttpStatus.is2xxSuccessful
     * @throws Exception
     */
    @Test
    public void createCustomer_18() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyen Van Anh");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988888988");
        customerSaveDto.setEmail("codegym123@gmail.com");
        customerSaveDto.setAddress("19 Hai Chau, Hai Chau, Da Nang");
        customerSaveDto.setCitizenCode("123456789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    /**
     * Create by DatNT
     * Date create 14/07/2023
     * Test method create [item] null
     * @expect Error and status HttpStatus.4x
     * @throws Exception
     */
    @Test
    public void createCustomer_name_13() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/null")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_birthday_13() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/null")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_gender_13() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/null")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_phoneNumber_13() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/null")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_email_13() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/null")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_address_13() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/null")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_citizenCode_13() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/null")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_image_13() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/null")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_frontCitizen_13() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/null")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_backCitizen_13() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/null")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_delete_13() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/null")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by DatNT
     * Date create 14/07/2023
     * Test method create [item] ""
     * @expect Error and status HttpStatus.4x
     * @throws Exception
     */

    @Test
    public void createCustomer_name_14() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/''")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_birthday_14() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/''")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_phoneNumber_14() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/''")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_email_14() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/''")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_address_14() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/''")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_citizenCode_14() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/''")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_image_14() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/''")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_frontCitizen_14() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/''")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_backCitizen_14() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/''")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    /**
     * Create by DatNT
     * Date create 14/07/2023
     * Test method create [item] wrong format
     * @expect Error and status HttpStatus.4x
     * @throws Exception
     */

    @Test
    public void createCustomer_name_15() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("nguyennnn223");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_birthday_15() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("12-2023-12");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_phoneNumber_15() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("9987654321");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_email_15() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("@@gmail");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_address_15() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("41234ancb23");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_citizenCode_15() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("oi232312332");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_image_15() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_frontCitizen_15() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-ga");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_backCitizen_15() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by DatNT
     * Date create 14/07/2023
     * Test method create [item] wrong Not greater than or equal to min length
     * @expect Error and status HttpStatus.4x
     * @throws Exception
     */

    @Test
    public void createCustomer_name_16() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Na");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_birthday_16() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("12-12");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_phoneNumber_16() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("9987");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_email_16() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("b@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_address_16() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_citizenCode_16() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("232312332");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_image_16() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://a.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_frontCitizen_16() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://i.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_backCitizen_16() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://i.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by DatNT
     * Date create 14/07/2023
     * Test method create [item] wrong greater than to max length
     * @expect Error and status HttpStatus.4x
     * @throws Exception
     */

    @Test
    public void createCustomer_name_17() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat Đatttttttttttttttt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_phoneNumber_17() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("098478545532");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_email_17() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbb@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_address_17() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("số 2223 Nguyễn Văn linh, Đà Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng Nẵng, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_citizenCode_17() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("2323123321231434");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_image_17() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://aimages.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thimages.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thimages.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thimages.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thimages.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/th.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_frontCitizen_17() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22_22i.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createCustomer_backCitizen_17() throws Exception {
        CustomerSaveDto customerSaveDto = new CustomerSaveDto();
        customerSaveDto.setName("Nguyễn Tiến Đạt");
        customerSaveDto.setBirthday("2000-10-05");
        customerSaveDto.setGender(1);
        customerSaveDto.setPhoneNumber("0988899902");
        customerSaveDto.setEmail("codegym@gmail.com");
        customerSaveDto.setAddress("19 Hải Châu, Hải Châu, Đà Nẵng");
        customerSaveDto.setCitizenCode("028799789999");
        customerSaveDto.setImage("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-8.jpg");
        customerSaveDto.setFrontCitizen("https://images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22/Thanh/thu-tuc-doi-cmnd-cccd-ma-vach-sang-cccd-gan-chip-8-760x367.jpg");
        customerSaveDto.setBackCitizen("https://images.baodantoc.vn/images.baodantoc.vn/uploads/2021/Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%Th%C3%A1ng%203es.baodantoc.vn/uploads/2021/Th%C3%A1ng%203/Ng%C3%A0y_22_22i.jpg");
        

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/customer/")
                        .content(this.objectMapper.writeValueAsString(customerSaveDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

}
