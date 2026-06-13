
public class DataTypes {

    static void main() {
//      Numeric datatypes > byte-8bits(-128 to 127), short, int, long

        byte num1 = 127;
//      will throw error duw to exceed range
//      byte num2 = 500;
        System.out.println("byte "+num1);
//      System.out.println(num2);

        short num3 = 32767;
        System.out.println("short "+num3);

        int num4 = 50000;
        System.out.println("int "+num4);

        long num5 = 329421370;
        System.out.println("long "+num5);

        float num6 = 3.142434f;
        System.out.println("float "+num6);

        double num7 = 3.1424356845654546;
        System.out.println("double "+num7);

        boolean eligibleToVote = true;
        System.out.println("boolean "+eligibleToVote);

        //a-z, A-Z > ASCII numeric value mapped
        char firstCharacter = 'a';
        System.out.println("char "+firstCharacter);
        //changing the char value by addition 2, a=97+2 > 99=c
        System.out.println("added in char "+(firstCharacter+2));
        //forced by explicitly to print char of 99
        //(char) is explicit type casting
        System.out.println("char "+(char)(firstCharacter+2));


        //Typecasting > Implicit conversion
        long newNum1 = num1; //byte into long
        System.out.println("Implicit Conversion "+newNum1);

        //Typecasting > Explicit conversion
        long value1 = 123456789;
        int value2 = (int) value1;

//      long value3 = 1234567897878979;
        // will throw error due to out of Integer range
//      int value4 = (int) value3;
//      System.out.println("Explicit Conversion "+value4);

        System.out.println("Explicit Conversion "+value2);

    }
}
