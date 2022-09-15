/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class MultiplePersonUC5 extends MultiplePersonMain {

	

	public void userDetails() {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter FirstName: ");
   
        list.add(input.next());
       
        System.out.print("Enter LastName: ");
        list.add(input.next());


        System.out.print("Enter Address: ");
        list.add(input.next());


        System.out.print("Enter City: ");
        list.add(input.next());


        System.out.print("Enter State: ");
        list.add(input.next());


        System.out.print("Enter Pincode: ");
        list.add(input.next());


        System.out.print("Enter Mobile No: ");
        list.add(input.next());


        System.out.print("Enter Email Id: ");
        list.add(input.next());

     //   list.add(input.next());
        
        
       System.out.println("------------------------");

            System.out.println("\nThe user data you entered is:" + list);
        }
     
    }
	
	
	
			

	

