// Program Header Block
// Area of Triangle
// Tapnish Wadhwa
// Septemper 28, 2016
// A program to calculate the Area of a Triangle given the base and height.



import javax.swing.*;
public class AreaOfTriangle
{
public static void main (String[] args)
{
  
  
// Step 1 - Declaring Variables
String strBase;
String strHeight;double  dblBase, dblHeight, dblArea;


// Step 2 - (Input) Assigning values to variables
strBase = JOptionPane.showInputDialog ("Enter the triangle's base: ");
strHeight = JOptionPane.showInputDialog ("Enter the triangle's height: ");
dblHeight = Double.parseDouble (strHeight);
dblBase = Double.parseDouble (strBase);
   
   
// Step 3 - Processing
dblArea = (dblBase*dblHeight)/2;
   
              
// Step 4 - Output
 JOptionPane.showMessageDialog (null, "A triangle with base " + dblBase +
" units\nand height " + dblHeight +
" units\nhas an area of " + dblArea + " square units");   
}
}
