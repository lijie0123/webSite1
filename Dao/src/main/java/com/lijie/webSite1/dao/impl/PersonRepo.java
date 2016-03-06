package com.lijie.webSite1.dao.impl;

import com.lijie.webSite1.dao.intr.IPersonRepo;
import com.lijie.webSite1.model.entity.Person;
import com.lijie.webSite1.model.exception.WebExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lj on 16-3-6.
 */
@Repository
public class PersonRepo implements IPersonRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void savePerson(Person person) throws WebExeption {

    }

    public Person getPersonById(int id) throws WebExeption {
        return null;
    }

    public List<Person> getAll() throws WebExeption {
        List<Person> persons=null;
        String sqlString="select * from person;";
        try{
            persons=jdbcTemplate.query(sqlString,new Object[]{},new PersonRowMapper());
        }catch (Exception e){
            e.printStackTrace();
            throw new WebExeption(2,"数据库访问出错");
        }
        return persons;
    }
}
