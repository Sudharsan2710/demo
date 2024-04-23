package com.chainsys.jfs6;

import java.util.Scanner;

public class StudentManagementApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        String id;
        String department;
        String password;
        int classesAttend;
        double amountTobePaid = 0;

        
        while (true) {
            System.out.print("Enter the name: ");
            name = input.next();
            if (name.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("Please enter a valid name with only characters.");
            }
        }

        
        while (true) {
            System.out.print("Enter the ID: ");
            id = input.next();
            if (id.matches("[0-9]+")) {
                break;
            } else {
                System.out.println("Please enter a valid ID with only numbers.");
            }
        }

        
        while (true) {
            System.out.print("Enter the Department: ");
            department = input.next();
            if (department.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("Please enter a valid department name with only characters.");
            }
        }

        
        while (true) {
            System.out.print("Enter the Password: ");
            password = input.next();
            if (password.matches("[a-zA-Z0-9]{10,}")) {
                break;
            } else {
                System.out.println("Please enter a password with at least 10 characters.");
            }
        }

        
        System.out.print("Enter the Classes Attend: ");
        while (true) {
            classesAttend = input.nextInt();
            if (classesAttend > 0) {
                break;
            } else {
                System.out.print("Please enter a valid number of classes: ");
            }
        }
        
        
//        while (true) {
//        	amountTobePaid  = input.nextDouble();
//            if (amountTobePaid > 0) {
//                break;
//            } else {
//                System.out.print("Please enter a valid amount: ");
//            }
//        }
        
        

        
        Apppojo pojo = new Apppojo();
        pojo.setName(name);
        pojo.setId(id);
        pojo.setDepartment(department);
        pojo.setClassesAttend(classesAttend);
        pojo.setPassword(password);
        pojo.setAmountTobePaid(amountTobePaid);

       
        Studentclass student = new Studentclass();
        student.studentName(pojo.getName(), pojo.getId(), pojo.getPassword());
        student.studentName(pojo.getClassesAttend(), pojo.getDepartment());
        student.feesCalculation();
    }
}
