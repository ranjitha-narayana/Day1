package com.projectexample.demoproject;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    @Autowired
    private UserRepository repo;
    @Autowired
    private TestEntityManager entityManager;
    @Test
    public void testCreateUser(){
        User user=new User();
        user.setEmail("ranju@gmail.com");
        user.setPassword("ran123");
        user.setFirstname("Ranjitha");
        user.setLastname("A");
        User savedUser=repo.save(user);
        User exitUser=entityManager.find(User.class,savedUser.getId());
        assertThat(exitUser.getEmail()).isEqualTo(user.getEmail());
    }

}
