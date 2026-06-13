import java.util.Scanner;

public class Conditionals {
    public static void main() {

        Scanner scanner=new Scanner(System.in);

//if statement
/*
        int dailyDSA = 12;
        if (dailyDSA >= 10) System.out.println("Good Consistency");

//if-else
        System.out.print("Enter the Age: ");
        int age=scanner.nextInt();
        if(age>=18)
            System.out.println("you're eligible to vote");
        else
            System.out.println("you're not eligible to vote");

//if else-if
        System.out.print("Enter the Accuracy: ");
        int accuracy = scanner.nextInt();
        if (accuracy >= 90){
            System.out.println("Excellent");
        }else if (accuracy>=75) {
            System.out.println("Good");
        } else if (accuracy>=60) {
            System.out.println("Average");
        }else {
            System.out.println("Needs Improvement");
        }

//another example of if else-if
        System.out.print("Enter the number of day: ");
        int day = scanner.nextInt();
        if (day == 1){
            System.out.println("Monday");
        }else if (day == 2) {
            System.out.println("Tuesday");
        }else if (day == 3) {
            System.out.println("Wednesday");
        }else if (day == 4) {
            System.out.println("Thursday");
        }else if (day == 5) {
            System.out.println("Friday");
        }else if (day == 6) {
            System.out.println("Saturday");
        }else if (day == 7) {
            System.out.println("Sunday");
        }else {
            System.out.println("Invalid Number of Day");
        }
        System.out.println("we're out of condition- line 51");


//nested if-else
        System.out.print("Enter the Subscription Status (true/false): ");
        boolean subscription = scanner.nextBoolean();
        System.out.print("Enter the number of solved Problems: ");
        int solvedProblems = scanner.nextInt();
        if (subscription == true){
            if (solvedProblems>=200){
                System.out.println("Unlock Advance Sheet");
            }else {
                System.out.println("Practice More Problems");
            }
        }else {
            System.out.println("Upgrade to Premium");
        }
        System.out.println("We're here at line 70 after condition");

//another example of nested if-else
        System.out.print("Enter the Number of age: ");
        int age = scanner.nextInt();
        System.out.print("Enter the Gender (M/F): ");
        char gender = scanner.next().charAt(0);
        if (gender == 'M'){
            System.out.println("You're a male");
            if (age>18){
                System.out.println("You're a male and age > 18 ");
            }else {
                System.out.println("You're a male and age <= 18");
            }
        }
        else {
            System.out.println("You're not a male");
            if (age>18){
                System.out.println("You're not a male and age > 18");
            }else {
                System.out.println("You're not a male and age <= 18");
            }
        }
        System.out.println("we're here after condition executed at line 91");


//ternary statement
        //(condition) ? "True" : "False";
        System.out.print("Enter the number of streak days: ");
        int streakDays = scanner.nextInt();
        String status = (streakDays>=30) ? "Consistent" : "Irregular";
        System.out.println(status);

//another example of ternary
        System.out.print("Enter the number of age: ");
        int age = scanner.nextInt();
        int result = (age>18) ? 22 : 12;
        System.out.println("Result "+result);
*/
//switch statement

        System.out.print("Enter the Value of Day: ");
        int day=scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number of day");
                break;  //correct way but optional, doesn't make sense
        }
        System.out.println("We're here outside os switch > line 139");

    }
}
