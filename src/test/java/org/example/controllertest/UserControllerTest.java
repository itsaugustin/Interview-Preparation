package org.example.controllertest;

import org.example.controller.UserController;
import org.example.customexception.RestExceptionHandler;
import org.example.customexception.UserNotFoundException;
import org.example.domain.User;
import org.example.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @InjectMocks
    private UserController controller;
    @Mock
    private UserService service;
    private MockMvc mvc;

    @Before
    public void setup() {
        mvc = MockMvcBuilders.standaloneSetup(controller)
                .setControllerAdvice(new RestExceptionHandler())
                .build();
    }

    @Test
    public void getUser_success() throws Exception {
        Mockito.when(service.getUserById(1L))
                .thenReturn(new User(1L, "John"));

        mvc.perform(get("/api/users/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("John"));
    }

    @Test
    public void getUser_notFound() throws Exception {
        Mockito.when(service.getUserById(2L))
                .thenThrow(new UserNotFoundException("User 2 not found"));

        mvc.perform(get("/api/users/2"))
                .andExpect(status().isNotFound())
                .andExpect(content().string("User 2 not found"));
    }
}
