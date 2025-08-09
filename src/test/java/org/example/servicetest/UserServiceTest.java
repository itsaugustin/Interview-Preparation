package org.example.servicetest;

import org.example.customexception.InvalidUserIdException;
import org.example.customexception.UserNotFoundException;
import org.example.domain.User;
import org.example.repo.UserRepository;
import org.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @InjectMocks
    private UserService service;
    @Mock
    private UserRepository repo;

    @Test
    public void whenUserExists_thenReturnUser() {
        User u = new User(1L, "John");
        Mockito.when(repo.findById(1L)).thenReturn(Optional.of(u));
        assertEquals("John", service.getUserById(1L).getName());
    }

    @Test
    public void whenInvalidId_thenThrow() {
        InvalidUserIdException ex = assertThrows(
                InvalidUserIdException.class, () -> service.getUserById(0L)
        );
        assertEquals("ID > 0 required", ex.getMessage());
    }

    @Test(expected = UserNotFoundException.class)
    public void whenNotFound_thenThrow() {
        Mockito.when(repo.findById(2L)).thenReturn(Optional.empty());
        service.getUserById(2L);
    }
}

