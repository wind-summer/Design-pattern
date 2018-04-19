package com.pattern.filter.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wenlf
 * @since 2018/4/9
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> aa= new ArrayList<>();
        aa.add("changcheng");
        aa.add("benchi");
        aa.add("baoma");
        aa.add("leikesasi");
        aa.add("daoqi");
        aa.add("fengtian");
        aa.add("dazhong");
        aa = aa.stream()
                .filter(a-> a.equalsIgnoreCase("dazhong"))
                .collect(Collectors.toList());
        System.out.println(aa.size());
    }
}
