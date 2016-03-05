package com.lijie.webSite1.dao.intr;

import com.lijie.webSite1.model.entity.Person;
import com.lijie.webSite1.model.exception.WebExeption;

import java.util.List;

/**
 * Created by lj on 16-3-6.
 */
public interface IPersonRepo {
    public void savePerson(Person person)throws WebExeption;
    public Person getPersonById(int id) throws WebExeption;
    public List<Person> getAll() throws WebExeption;
}
