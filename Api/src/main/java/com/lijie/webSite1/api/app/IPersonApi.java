package com.lijie.webSite1.api.app;

import com.lijie.webSite1.api.dto.PersonDto;
import com.lijie.webSite1.model.entity.Person;
import com.lijie.webSite1.model.exception.WebExeption;

import java.util.List;

/**
 * Created by lj on 16-3-6.
 */
public interface IPersonApi {
    public void savePerson(PersonDto personDto) throws WebExeption;
    public PersonDto getPersonById(int id) throws WebExeption;
    public List<PersonDto> getAll() throws WebExeption;
}
