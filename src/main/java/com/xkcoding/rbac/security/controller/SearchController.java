package com.xkcoding.rbac.security.controller;

import com.xkcoding.rbac.security.common.ApiResponse;
import com.xkcoding.rbac.security.constants.ElasticsearchConstant;
import com.xkcoding.rbac.security.model.Person;
import com.xkcoding.rbac.security.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    @Autowired
    private PersonService personService;
    @GetMapping("/index")
    public ApiResponse index(){
        List<Person> personList = personService.searchList(ElasticsearchConstant.INDEX_NAME);
        return ApiResponse.ofSuccess(personList);
    }
}
