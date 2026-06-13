public class Operators {
    static void main() {



        //Unary Operators
        System.out.println("\nUnary Operators");

        int activeUsers = 100;

        //1st activeUsers incremented by 1 and got -> 101
        int preINC = ++activeUsers;

        //activeUsers=101,
        // 1st activeUsers utilised and print -> 101
        int postINC = activeUsers++;
        //after activeUsers incremented by 1 and got -> 102

        System.out.println("pre Increment by 1 "+preINC);
        System.out.println("post Increment "+postINC);
        System.out.println("Active Users "+activeUsers);


        //Assignment Operators
        System.out.println("\nAssignment Operators");

        int ratingPoints = 100;
        System.out.println("Assign "+ ratingPoints);

        ratingPoints += 20; // ratingPoints = 100+20
        System.out.println("Add Assign 20 "+ratingPoints);

        ratingPoints -= 10; // ratingPoints = 100-10
        System.out.println("Subtract Assign 10 "+ratingPoints);

        ratingPoints *= 20; // ratingPoints = 100*20
        System.out.println("Multiply Assign 20 "+ratingPoints);

        ratingPoints /= 4; // ratingPoints = 100/4
        System.out.println("Divide Assign 4 "+ratingPoints);

        ratingPoints %= 30; // ratingPoints = 100%30
        System.out.println("Modulus Assign 30 "+ratingPoints);


        //Logical Operators
        System.out.println("\nLogical Operators");

        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println("Logical AND result "+ (completedDSA && completedCore));
        System.out.println("Logical OR result "+(completedDSA || completedCore));
        System.out.println("Logical Not result "+(!completedCore));


        //Relational Operators
        System.out.println("\nRelational Operators");

        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println("EqualTo "+ (currentStreak == targetStreak));
        System.out.println("NotEqualTo "+(currentStreak != targetStreak));
        System.out.println("GreaterThan "+(currentStreak > targetStreak));
        System.out.println("LessThan "+(currentStreak < targetStreak));
        System.out.println("GreaterThanEqual "+(currentStreak <= targetStreak));
        System.out.println("LessThanEqual "+(currentStreak >= targetStreak));


        //Arithmetic Operators
        System.out.println("\nArithmetic Operators");
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        // decimal num will be ignored, need to typecast
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println("Total "+total);
        System.out.println("Difference "+difference);
        System.out.println("Projected "+projected);
        System.out.println("Average "+average);
        System.out.println("Remainder "+remainder);

    }
}
