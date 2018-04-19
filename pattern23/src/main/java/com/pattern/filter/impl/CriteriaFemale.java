package com.pattern.filter.impl;

import com.pattern.filter.Criteria;
import com.pattern.filter.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wenlf
 * @since 2018/4/9
 */
public class CriteriaFemale implements Criteria {
    /**
     * 遇见标准
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream()
                .filter(p -> p.getGender().equalsIgnoreCase("FEMALE"))
                .collect(Collectors.toList());
    }
}
