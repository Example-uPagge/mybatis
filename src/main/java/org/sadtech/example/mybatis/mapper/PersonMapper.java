package org.sadtech.example.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.sadtech.example.mybatis.domain.Person;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonMapper {

    @Insert("INSERT INTO PERSON (NAME, TELEGRAM_ID) VALUES (#{name}, #{telegramId})")
    void save(Person person);

}
