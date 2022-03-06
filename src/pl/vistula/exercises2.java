package pl.vistula;

public class exercises2 {
    public static void main(String[] args){
        float earthWeight;
        float marsWeight;
        double marsWeightInDouble;
        int marsWeightInInt;

        earthWeight = 80;
        marsWeight = (earthWeight + 0.38F);
        System.out.println(earthWeight + "kg on earth is" + marsWeight + "kg on Mars");

        // assigment (compatible types) from float to double
        marsWeightInDouble = earthWeight;
        System.out.println("kilograms on mars after converting to double "+marsWeightInDouble);

        //printing a variable lining the length of printing to 4 decimal place
        System.out.printf("kilograms on mars displayed to four decimal places: %.4f %n", marsWeightInDouble);

        //a floating paint type cast to integer
        marsWeightInInt = (int)marsWeightInDouble;
        System.out.println("kilograms on mars when casted to integer  " + marsWeightInInt);

        //coasting on int type to char
        char c = (char)marsWeightInInt;
        System.out.println(" the ASCII table equivalent of marsWeightInInt is: " + c);

        //assign the value of performing some nathematical operation on the char character to the new int variable
        int exampleOfMathOnChar = c * c;
        System.out.println("An example of a math operation on the char type: "+ exampleOfMathOnChar);


    }
}
