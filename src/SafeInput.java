import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner in, String prompt){
        String retString = "";
        boolean done = false;
        do {
            System.out.println(prompt);
            retString = in.nextLine();
            if (retString.length() > 0) {
                done = true;
            }
        }while(!done);
        return retString;
    }
    public static int getInt(Scanner in, String prompt){
        int retVal=0;
        String trash = "";
        boolean done = false;
        do{
            System.out.println(prompt);
            if(in.hasNextInt()){
                retVal = in.nextInt();
                in.nextLine();
                done = true;
            }
            else{
                trash = in.nextLine();
                System.out.println("Sorry, you must enter an integer");
            }
        }while(!done);
        return retVal;
    }
    public static double getRangedDouble(Scanner in, String prompt, int low, int high){
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do{
            System.out.println(prompt + "[" + low + " - " + high + "]");
            if(in.hasNextDouble()){
                retVal = in.nextDouble();
                in.nextLine();
                if(retVal >= low && retVal <= high){
                    done = true;
                }
                else{
                    System.out.println("The number is out of range.");
                }
            }
            else{
                trash = in.nextLine();
                System.out.println("You must enter a number.");
            }
        }while(!done);
        return retVal;
    }
    public static boolean getYNConfirm(Scanner in, String prompt){
        boolean retVal = true;
        boolean done = false;
        String response = "";
        do{
            System.out.println(prompt + "[Y/N]");
            response = in.nextLine();
            if(response.equalsIgnoreCase("Y")){
                retVal = true;
                done = true;
            }
            else if (response.equalsIgnoreCase("N")){
                retVal = false;
                done = true;
            }
            else{
                System.out.println("You must answer Y or N");
            }
        }while(!done);
        return retVal;
    }
    public static double getDouble(Scanner pipe, String prompt){
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do{
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble()){
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }else{
                trash = pipe.nextLine();
                System.out.println("Invalid input. Enter a number.");
            }
        }while(!done);
        return retVal;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
        int retVal = 0;
        String trash = "";
        boolean done = false;
        do{
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextInt()){
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal>=low && retVal<=high){
                    done = true;
                }else{
                    System.out.println("Invalid input. Number must be within the range.");
                }
            }else{
                trash = pipe.nextLine();
                System.out.println("Invalid input. Enter an integer.");
            }
        }while(!done);
        return retVal;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("Invalid input. Number must be within the range.");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Invalid input. Enter a number.");
            }
        } while (!done);
        return retVal;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retString = "";
        boolean done = false;
        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine();
            if (retString.matches(regEx)) {
                done = true;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        } while (!done);
        return retString;
    }
    public static void prettyHeader(String msg) {
        int width = 60;
        int space = width - 6 - msg.length();
        int leftSpace = space / 2;
        int rightSpace = space - leftSpace;
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("***");
        for (int i = 0; i < leftSpace; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightSpace; i++) {
            System.out.print(" ");
        }
        System.out.println("***");
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

