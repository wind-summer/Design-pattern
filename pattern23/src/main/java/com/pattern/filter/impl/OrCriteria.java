package com.pattern.filter.impl;

import com.pattern.filter.Criteria;
import com.pattern.filter.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wenlf
 * @since 2018/4/9
 */
public class OrCriteria implements Criteria {

    private String gender;
    private String maritalStatus;

    public OrCriteria(String gender, String maritalStatus) {
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
    /**
     * 遇见标准
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream()
                .filter(p -> (p.getGender().equalsIgnoreCase(gender) || p.getMaritalStatus().equalsIgnoreCase(maritalStatus)))
                .collect(Collectors.toList());
    }
}
