package com.intuit.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class GreetControllerTest {

    @MockBean
    private GreetController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHello() throws Exception{
        when(controller.hello("Sam")).thenReturn("Hello Sam");

        mockMvc.perform(get("/hello/Sam"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello Sam"));
    }
}
