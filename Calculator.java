// Author: Saketh Reddy Sudireddy
public class Calculator {
    private static int result;

    public Calculator() {
        result = 0;
    }// default constructor



   // add

   public void add(int number)
   {
     result += number;

   }// end of add

    // substract

    public void substract(int number)
    {
      result -= number;
    }// end of substract

    // multiply
    public void multiply(int number1, int number2)
    {

        result = number1 * number2;
    }

// divide

   public void div(int number1, int number2)
   {
      result = number1 / number2;

   }
    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
//declare 2 numbers

	int num1 = 420, num2 = 10;
// instantiate an object of type calculator

Calculator Mycalculator = new Calculator();

System.out.println("My name is Saketh Reddy Sudireddy\n");

// add num1

Mycalculator.add(num1);
System.out.println("Addition of 0 and "+num1+" is " + Mycalculator.getResult());
        
// substract num2


Mycalculator.substract(num2);
System.out.println("\nSubstraction "+num1+" and "+num2+" is " + Mycalculator.getResult());

//multiply num1 and num2


Mycalculator.multiply(num1,num2);
System.out.println("\nMultiplication of "+num1+" and "+num2+" is " + Mycalculator.getResult());

// display the result
Mycalculator.div(num1,num2);
System.out.println("\nDivision of "+num1+" and "+num2+" is " + Mycalculator.getResult());

    }
}
