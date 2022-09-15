/**
 * 
 */
package com.bridgelabz;


import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class MultipleAddressBookUC6 extends MultiplePersonMain {

	public void addressBook() {
		// TODO Auto-generated method stub
		 Dictionary<Integer, String> dict = new Hashtable<Integer, String>();

		 
		 Scanner input = new Scanner(System.in);
		 dict.put(input.nextInt(), input.next());
		 
		 dict.put(input.nextInt(), input.next());
		 dict.put(input.nextInt(), input.next());
		 dict.put(input.nextInt(), input.next()); 
		
		
		
        System.out.println("\nThe name of the new Address Book is: " + dict);
	
	
	
}
}