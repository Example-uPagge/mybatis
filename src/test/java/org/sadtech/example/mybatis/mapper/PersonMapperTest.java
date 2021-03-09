package org.sadtech.example.mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.sadtech.example.mybatis.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

@SpringBootTest
class PersonMapperTest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    @Order(1)
    void insetIntoPerson() {
        final Person person = new Person();
        person.setName("Oleg");
        person.setTelegramId(987654321L);

        personMapper.save(person);
    }

}
