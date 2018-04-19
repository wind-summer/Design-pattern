package com.pattern.filter;

import java.util.List;

/**
 * @author wenlf
 * @since 2018/4/9
 */
public interface Criteria {

    /**
     * 遇见标准
     * @param persons
     * @return
     */
    public List<Person> meetCriteria(List<Person> persons);
}
