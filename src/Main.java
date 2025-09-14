//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
      int intOperandA = 24; // Declare the int variables / increased the value of intOperandA from 1 to 25 to avoid negative values//
      int intOperandB = 4;
      int intSum = 6;
      int intProduct = 10;
      int intDifference = 15;
      int intQuotient = 18;
      int intModulo = 20;


       // Declare the doubles//
        double doubleOperandA = 3.50;
        double doubleOperandB = 7.50;
        double doubleSum = 12.50;
        double doubleProduct = 15.50;
        double doubleDifference = 18.50;
        double doubleQuotient = 24.50;

        intSum = intOperandA + intOperandB; // using the arithmetic operator
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum); // Output statement );

        intDifference = intOperandA - intOperandB; // using the difference operator
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference); // Output statement );

        intProduct = intOperandA * intOperandB; // using the product operator
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct); // Output statement );

        int result = intOperandA / intOperandB; // using the division operator
        System.out.println("The result of division using ints of " + intOperandA + " " + intOperandB + " is " + result); // Output statement )

        intQuotient = intOperandA / intOperandB; // using quotient operator
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient); // Output statement )

        intModulo = intOperandA % intOperandB; // using the Modulo or remainder operator
        System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo); // Output statement );


        // Testing the operators with the double variables
        doubleSum = doubleOperandA + doubleOperandB; // adding the doubles
        System.out.println("The double sum of using double of " + doubleOperandA+ " " + doubleOperandB + " is " + doubleSum); // Output statement );

        doubleProduct = doubleOperandA * doubleOperandB; // using the product operator/ precision maintained
        System.out.println("The double product using double of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct); // Output statement );

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The double difference using double of " + doubleOperandA + " " + doubleOperandB+ " is " + doubleDifference); // Output statement );
        // output difference does not make sense

        doubleDifference = doubleOperandB - doubleOperandA;
        System.out.println("The double difference using double of " + doubleOperandB + " " + doubleOperandA+ " is " + doubleDifference); // Output statement );
        // output difference now gives a positive value if variables are switched

        double Difference = doubleOperandA - doubleOperandB;  // using the difference operator
        System.out.println("The difference is :  " + Difference);

        double Difference1 = doubleOperandB - doubleOperandA;
        System.out.println("The difference is :  " + Difference1);

        doubleQuotient = doubleOperandA / doubleOperandB; // using the quotient
        System.out.println("The double quotient of using double of " + doubleOperandA+ " " + doubleOperandB + " is " + doubleQuotient); // Output statement );


        double sum ;  // other examples
        double valA = 5.50;
        int valB = 8;

        sum = valA + valB; // double = doublt + int

        System.out.println("The sum of " + valA + " and " + valB + " is " + sum);

        sum = valB; // double on int

        System.out.println( "sum is "  + sum);

        int intsum = 15;
        intsum = (int) valA; // will not take a double into an integer . precision is lost as it strips the 50 cents off
        System.out.println( " The sum of valA is " + intsum);

        int iiisum = 8 / 3 ;

        System.out.println(" iisum " + iiisum); // fractional part of .20 lost but java does not consider it an error


        // Part 2 : using boolean, strings and int
        double myLunchCost = 12.50; // using double
        System.out.println("The cost of my lunch is: " + myLunchCost);

        int intNumKids = 5; //number of kids in your family
        System.out.println(" The number of kids in your family is: " + intNumKids);

        boolean israining = false; // is it raining?
        System.out.println("is it raining? " + israining);

        double myDiselPrice = 4.00; // price of a gallon of gas
        System.out.println("The price of my disel today is: " + myDiselPrice);

        int myFavoriteNumber = 25; // finding my favorite number
        System.out.println("my favorite number is: " + myFavoriteNumber);

        double myShoeSize = 9; // display shoe size
        System.out.println("my shoe size is: " + myShoeSize);

        int birthMonth = 8; // enter your date of birth
        System.out.println("Please enter your birth month correctly: " + birthMonth);

        String user = "Joan"; // enter your fullname
        String lastname = "Nnadi";
        String fullname = user + " "  + lastname;

        System.out.println(fullname);






















    }
}