package com.example;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class PersonTest
{
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ArrayList<Person> persons = new ArrayList<Person>();
        Person Joe = new Person("Joe", "Smith", 40);
        Person Amy = new Person("Amy", "Gold", 32);
        Person Tony = new Person("Tony", "Stork", 21);
        Person Sean = new Person("Sean", "Irish", 24);
        Person Tina = new Person("Tina", "Brock", 28);
        Person Lenny = new Person("Lenny", "Hep", 18);

        Comparator<Person> myComparatorFA = new Comparator<Person>() 
        {

            @Override
            public int compare(Person o1, Person o2) {
                // TODO Auto-generated method stub
                String string1 = o1.getFirstName(), string2 = o2.getFirstName();

                return string1.compareTo(string2);
            }
        };
        Comparator<Person> myComparatorFD = new Comparator<Person>() 
        {

            @Override
            public int compare(Person o1, Person o2) {
                // TODO Auto-generated method stub
                String string1 = o1.getFirstName(), string2 = o2.getFirstName();

                return string2.compareTo(string1);
            }
        };
        Comparator<Person> myComparatorLA = new Comparator<Person>() 
        {

            @Override
            public int compare(Person o1, Person o2) {
                // TODO Auto-generated method stub
                String string1 = o1.getLastName(), string2 = o2.getLastName();

                return string1.compareTo(string2);
            }
        };
        Comparator<Person> myComparatorLD = new Comparator<Person>() 
        {

            @Override
            public int compare(Person o1, Person o2) {
                // TODO Auto-generated method stub
                String string1 = o1.getLastName(), string2 = o2.getLastName();

                return string2.compareTo(string1);
            }
        };
        Comparator<Person> myComparatorAA = new Comparator<Person>() 
        {

            @Override
            public int compare(Person o1, Person o2) {
                // TODO Auto-generated method stub
                Integer int1 = o1.getAge(), int2 = o2.getAge();

                return int1.compareTo(int2);
            }
        };
        Comparator<Person> myComparatorAD = new Comparator<Person>() 
        {

            @Override
            public int compare(Person o1, Person o2) {
                // TODO Auto-generated method stub
                Integer int1 = o1.getAge(), int2 = o2.getAge();

                return int2.compareTo(int1);
            }
        };

        persons.add(Joe);
        persons.add(Amy);
        persons.add(Tony);
        persons.add(Sean);
        persons.add(Tina);
        persons.add(Lenny);
        persons.sort(myComparatorFA);
        System.out.println(persons.toString());
        persons.sort(myComparatorFD);
        System.out.println(persons.toString());
        persons.sort(myComparatorLA);
        System.out.println(persons.toString());
        persons.sort(myComparatorLD);
        System.out.println(persons.toString());
        persons.sort(myComparatorAA);
        System.out.println(persons.toString());
        persons.sort(myComparatorAD);
        System.out.println(persons.toString());
    }
}
