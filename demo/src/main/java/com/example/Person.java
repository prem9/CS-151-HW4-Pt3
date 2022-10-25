package com.example;

/**
 * Hello world!
 *
 */
public class Person 
{
    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName2, String lastName2, Integer age2)
    {
        firstName = firstName2;
        lastName = lastName2;
        age = age2;
    }
    public void setFirstName(String firstNameSet)
    {
        firstName = firstNameSet;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String LastNameSet)
    {
        lastName = LastNameSet;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setAge(Integer ageSet)
    {
        age = ageSet;
    }
    public Integer getAge()
    {
        return age;
    }
    public String toString()
    {
        String personInfo = "Person Info: " + firstName + " " + lastName + " Age: " + age;
        return personInfo;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
