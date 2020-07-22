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

    @RequestMapping("/test")
    public String getTest(){
        return "test";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody  EarlgreyResponse get(@PathVariable(value="id") String id){
        List<String> errors = new ArrayList<>();
        EarlgreyDto earlgreyDto = null; 
        try{
            earlgreyDto = earlgreyService.get(id);
        }
        catch (final Exception e) {
            errors.add(e.getMessage());
        }
        return EarlgreyAdapter.earlgreyResponse(earlgreyDto,errors);
    } 

    public @ResponseBody List<EarlgreyResponse> getAll(){
        List<String> errors = new ArrayList<>();
        List<EarlgreyDto> earlgreyDtos = earlgreyService.getAll();
        List<EarlgreyResponse> earlgreyResponses = new ArrayList<>();
        earlgreyDtos.stream().forEach(earlgrey -> {
            earlgreyResponses.add(EarlgreyAdapter.earlgreyResponse(earlgreyDtos, errors))
        });

        return earlgreyResponses;
    }

}