package com.kgc.controller;

import com.kgc.pojo.Person;
import com.kgc.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 张康硕
 * @create 2020-10-01 22:37
 */
@Controller
public class PersonController {
    @Resource
    PersonService personService;

    @RequestMapping("/doselect")
    public String doselect(Model model) {
        List<Person> persons = personService.getlist();
        model.addAttribute("persons", persons);
        return "select";
    }

    @RequestMapping("/toadd")
    public  String toadd(){
        return "add";
    }
    @RequestMapping("/doadd")
    public String add(Person person) {
        int i=personService.add(person);
        return "redirect:/doselect";
    }
    @RequestMapping("/del/{id}")
    public String del(@PathVariable Integer id){
        int i=personService.del(id);
        return "redirect:/doselect";
    }
}
