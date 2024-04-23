package com.chainsys.jfs6;
import java.util.Scanner; 
public class Studentclass {

		Scanner input =new Scanner(System.in);
    public void studentName(String name, String id, String password) {
        System.out.println("Name: " + name + " ID of the Student is: " + id);
    }

    public void studentName(int classesAttend, String department) {
        System.out.println("Department is: " + department);

        if (classesAttend > 50) {
            System.out.println("You have " + classesAttend + "% attendance so you can attend the Exam.");
        } else {
            System.out.println("Your attendance percentage is low and you cannot attend the Exam.");
        }
    }
    
    public void feesCalculation() {
    	double totalSemesterfees=45000;
    	
    	System.out.println("Total semester Fees is: "+ totalSemesterfees );
    	
    	System.out.println("Do you want to pay fees (Y/N)");
    		String c =input.next();
    		
    		
    		
    		switch (c) {
    		case "Y":
    			System.out.println("Do you already paid(Y/N): ");
    			char d=input.next().charAt(0);
    			
    			if(d=='Y') {
    				System.out.println("How much paid: ");
    				double hisPayment = input.nextDouble();
    				double remainingAmount =totalSemesterfees -hisPayment;
    				System.out.println("you have to pay "+remainingAmount);
    				
    			}else
    			{
    				System.out.println("you have to pay "+totalSemesterfees);
    			}
    			break;
    		case "N" :
    			
    			System.out.println("Try to pay Semester Fees");
    			break;
    			
    		 default:  System.out.println("Thank yoy");
    		}
    		}
    		
    	
    }

