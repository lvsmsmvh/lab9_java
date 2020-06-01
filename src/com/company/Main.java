package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FieldLengthLimitException, IncorrectSalaryException {

/*
        Manager manager1 = new Manager(0, "Ilya", "Vasilyev", 200);
        Manager manager2 = new Manager(1, "Yuriy", "Ivanov", 300);
        Employee employee1 = new Employee(2, "Igor", "Mokrivskiy");
        Employee employee2 = new Employee(3, "Stanislav", "Busterenko");
        Employee employee3 = new Employee(4, "Vladislav", "Karavayev");

        employee1.setManager(manager2);
        employee2.setManager(manager2);
        employee3.setManager(manager1);
        manager2.setManager(manager1);

        System.out.println(employee1);
        System.out.println(employee1.getTopManager());
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee3.getTopManager());
        System.out.println(manager1);
        System.out.println(manager2);

        Manager manager3 = new Manager(5, "Vladimir", "Zelenskiy", 150);
        Manager manager4 = new Manager(6, "Angela", "Merkel", 380);
        Manager manager5 = new Manager(7, "Freddie", "Mercury", 200);
        Manager manager6 = new Manager(8, "Mike", "Posner", 500);
        Employee employee4 = new Employee(9, "Oleh", "Lyashko");

        manager4.setManager(manager3);
        manager5.setManager(manager4);
        manager6.setManager(manager5);
        employee4.setManager(manager6);
*/

        /*
        System.out.println(manager3);
        System.out.println(manager4);
        System.out.println(manager4.getTopManager());
        System.out.println(manager5);
        System.out.println(manager6);
        System.out.println(manager6.getTopManager());
        System.out.println(employee4);
        System.out.println(employee4.getTopManager());
        */

        System.out.println("input 5 managers");
        int id = 1;
        Manager[] managers = new Manager[5];
        for (Manager manager : managers) {
                System.out.print("name : ");
                String name = new Scanner(System.in).nextLine();
                System.out.print("surname : ");
                String surname = new Scanner(System.in).nextLine();
                System.out.print("bonus : ");
                int bonus = new Scanner(System.in).nextInt();
                manager = new Manager(id, name, surname, bonus);
                id++;
                System.out.println("\nDone!" + manager + "\n\nNext:");
        }


    }
}