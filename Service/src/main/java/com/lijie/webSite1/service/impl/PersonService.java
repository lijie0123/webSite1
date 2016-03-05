package com.lijie.webSite1.service.impl;

import com.lijie.webSite1.dao.intr.IPersonRepo;
import com.lijie.webSite1.model.entity.Person;
import com.lijie.webSite1.model.exception.WebExeption;
import com.lijie.webSite1.service.intr.IPersonService;
import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lj on 16-3-6.
 */
@Service
public class PersonService implements IPersonService{

    @Autowired
    private IPersonRepo personRepo;

    public void savePerson(int id, String name, int sex, int age, String desc) throws WebExeption {
        if(name==null||sex>3||sex<1)throw new WebExeption(1,"参数有误");
        if(desc==null)desc="";
        Person person=new Person(id,name,sex,age,desc);
        personRepo.savePerson(person);
    }

    public Person getPersonById(int id) throws WebExeption {
        return personRepo.getPersonById(id);
    }

    public List<Person> getAll() throws WebExeption {
        return personRepo.getAll();
    }
}
