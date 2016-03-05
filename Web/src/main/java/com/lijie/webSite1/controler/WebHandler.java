package com.lijie.webSite1.controler;

import com.lijie.webSite1.api.app.IPersonApi;
import com.lijie.webSite1.api.dto.PersonDto;
import com.lijie.webSite1.dao.impl.PersonRepo;
import com.lijie.webSite1.dao.intr.IPersonRepo;
import com.lijie.webSite1.model.exception.WebExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lj on 16-3-5.
 */
@Controller
@RequestMapping("/")
public class WebHandler {
    @Autowired
    private IPersonApi personApi;

    @RequestMapping("welcomPage")
    public ModelAndView conIndex(HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView("welcome");
        modelAndView.addObject("title",request.getRequestURI());
        return modelAndView;
    }
    @RequestMapping("savePerson")
    public String conSavePerson(@RequestParam("id") int id, @RequestParam("name") String name,@RequestParam("sex") int sex,
                              @RequestParam("age") int age, @RequestParam("desc") String desc){
        PersonDto personDto=new PersonDto(id,name,sex,age,desc);
        try{
            personApi.savePerson(personDto);
        }catch (WebExeption e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
        return "getAll";
    }
    @RequestMapping("getAll")
    public ModelAndView conGetAll(){
        String result=null;
        try{
            result=getAllString();
        }catch (WebExeption e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
        ModelAndView modelAndView=new ModelAndView("getAll");
        modelAndView.addObject("result",result);
        return modelAndView;
    }

    private String getAllString() throws WebExeption{
        List<PersonDto> personDtos=null;
        personDtos=personApi.getAll();
        String result="";
        if(personDtos!=null){
            for(PersonDto personDto:personDtos){
                result+=personDto.toString();
            }
        }
        return result;
    }
}
