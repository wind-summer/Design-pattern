package com.pattern.filter.test;

import com.pattern.filter.Criteria;
import com.pattern.filter.Person;
import com.pattern.filter.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wenlf
 * @since 2018/4/9
 */
public class Test {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria("male", "single");
        Criteria singleOrFemale = new OrCriteria("female", "single");

        System.out.println("Males: "+male.meetCriteria(persons).size()+"个");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: "+female.meetCriteria(persons).size()+"个");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingles: "+single.meetCriteria(persons).size()+"个");
        printPersons(single.meetCriteria(persons));

        System.out.println("\nSingle Males: "+singleMale.meetCriteria(persons).size()+"个");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: "+singleOrFemale.meetCriteria(persons).size()+"个");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
