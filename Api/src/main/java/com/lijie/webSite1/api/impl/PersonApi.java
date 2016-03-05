package com.lijie.webSite1.api.impl;

import com.lijie.webSite1.api.app.IPersonApi;
import com.lijie.webSite1.api.dto.PersonDto;
import com.lijie.webSite1.model.entity.Person;
import com.lijie.webSite1.model.exception.WebExeption;
import com.lijie.webSite1.service.intr.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lj on 16-3-6.
 */
@Service
public class PersonApi implements IPersonApi{
    @Autowired
    private IPersonService personService;
    public void savePerson(PersonDto personDto) throws WebExeption {
        personService.savePerson(personDto.getId(),personDto.getName(),personDto.getSex(),personDto.getAge(),personDto.getDesc());
    }

    public PersonDto getPersonById(int id) throws WebExeption {
        Person person=personService.getPersonById(id);
        PersonDto personDto=new PersonDto(person.getId(),person.getName(),person.getSex(),person.getAge(),person.getDescription());
        return personDto;
    }

    public List<PersonDto> getAll() throws WebExeption {
        List<PersonDto> personDtos=new ArrayList<PersonDto>();
        List<Person> persons=personService.getAll();
        if(persons==null)return null;
        for(Person person:persons){
            personDtos.add(new PersonDto(person.getId(),person.getName(),person.getSex(),person.getAge(),person.getDescription()));
        }
        return personDtos;
    }
}
