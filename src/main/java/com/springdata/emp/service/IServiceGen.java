package com.springdata.emp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IServiceGen {

    @Value("listOfValues")
    private String listOfValues;

    @Value("#{'${listOfValuesAbc}'.split(',')}")
    private List<String> valuesListAbc;

    @Value("#{${valuesMap}}")
    private Map<String, Integer> valuesMap;

    @Value("#{${valuesMap}.key1}")
    private Integer valuesMapKey1;

    public Object getModel(){
        Map<Object,Object> map = new HashMap<>();
        map.put("listOfValues",listOfValues);
        map.put("valuesListAbc",valuesListAbc);
        map.put("valuesMap",valuesMap);
        map.put("valuesMapKey1",valuesMapKey1);

        return map;
    }
}
