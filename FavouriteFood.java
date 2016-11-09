//**********************************************************
// Assignment: Favourite Food
//
// Description: A program that tells the user if a like their favourite food or not
// Author: Tapnish Wadhwa 
//
// Date Start: 10/27/2016
// Date Completed: 10/27/2016
//
// Completion time: 3 minutes 
//            
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one 
//   in designing and debugging my program.
//*********************************************************




import java.util.*;
public class FavouriteFood
{ 
 public static void main (String[] args) 
 {
 
 String myFood;
 String userFood;
 
 myFood = "pizza";
 
 Scanner input = new Scanner (System.in);
 
  System.out.println("Enter a food ");
   userFood = input.nextLine();
 
 if (myFood.equals(userFood)) {
 System.out.println ("I Like " +(myFood) + " too!!");
 }
 else { 
 System.out.println ("I hate " + (userFood));
 }
 }
 
 }