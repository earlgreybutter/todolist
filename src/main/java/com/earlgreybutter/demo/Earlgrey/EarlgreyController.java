package com.earlgreybutter.demo.Earlgrey;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/earlgrey")
public class EarlgreyController {
    @Autowired
    private EarlgreyService earlgreyService;

    @RequestMapping(value = "{/id}", method = RequestMethod.GET)
    public @ResponseBody  EarlgreyResponse get(@PathVariable(value="id") String id){
        List<String> errors = new ArrayList<>();
        Earlgrey earlgrey = null; 
        try{
            earlgrey = earlgreyService.get(id);
        }
        catch (final Exception e) {
            errors.add(e.getMessage());
        }
        return EarlgreyAdapter.earlgreyResponse(earlgrey,errors);
    } 
}