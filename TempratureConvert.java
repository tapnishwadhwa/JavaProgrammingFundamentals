import java.util.*;
public class TempratureConvert
{
  public static void main (String[] args)  {  

    Scanner input = new Scanner(System.in); // assign scanner
    
    double tempC;// declaring variables
    double tempF;
    
    
    System.out.println ("Enter the temprature in celcius"); // assigning values to variables
    tempC = input.nextDouble();

    tempF = (((tempC*9)/5)+32); // processing 
    
   System.out.println (tempC + " in Celcius is " +tempF + " in Farenheit"); // output

}
}