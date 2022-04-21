package com.homeprogect.fiveproject;

public class Employee {

    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов

    persArray[0] = new Person("Сидоров", "Иван", "Петрович", "Директор",
                            "sidorov@mail.ru", "89125437685", 100000, 53);
    Person person1= new Person("Петров", "Василий", "Афанасьевич", "Инженер",
            "petrov@mail.ru", "89159873621", 60000, 48);
    Person person2 = new Person("Иванов", "Сергей", "Игоревич", "Программист",
            "ivanov@mail.ru", "89037658934", 75000, 35);
    Person person3= new Person("Васильев", "Олег","Олегович", "Программист",
            "vasilev@mail.ru","89236578543", 75000, 38);
    Person person4= new Person("Кремов", "Виталий", "Викторович", "Администратор",
            "kremov@mail.ru", "89165128734", 50000, 26);


}
