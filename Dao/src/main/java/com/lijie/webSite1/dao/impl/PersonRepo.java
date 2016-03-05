package com.lijie.webSite1.dao.impl;

import com.lijie.webSite1.dao.intr.IPersonRepo;
import com.lijie.webSite1.model.entity.Person;
import com.lijie.webSite1.model.exception.WebExeption;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lj on 16-3-6.
 */
@Repository
public class PersonRepo implements IPersonRepo {


    public void savePerson(Person person) throws WebExeption {

    }

    public Person getPersonById(int id) throws WebExeption {
        return null;
    }

    public List<Person> getAll() throws WebExeption {
        return null;
    }
}
