package com.homeprogect.fiveproject;

public class Person {
    private String surname;
    private String name;
    private String middlename;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person (String surname, String name, String middlename, String position, String email, String phone, int salary,int age) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void ShowPerson (){
        System.out.println("Фамилия " + surname + " Имя " + name + " Отчество " + middlename + " Должность " + position );
        System.out.println(" Email " + email + " Телефон " + phone +" Зарплата " + salary + " Возраст " + age);

    }

    public int getAge() {
        return age;
    }
}
