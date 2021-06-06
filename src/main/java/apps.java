/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;
import java.util.Date;

public class apps {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("What is your current age? ");
        String age=in.nextLine();
        int ageNum=Integer.parseInt(age);
        System.out.print("At what age would you like to retire? ");
        String retireAge=in.nextLine();
        int retireAgeNum=Integer.parseInt(retireAge);
        int yearsLeft=retireAgeNum-ageNum;
        System.out.println("You have "+yearsLeft+" years left until you can retire.");

        Date current=new Date();
        int year=current.getYear();
        year+=1900;
        int retireYear=year+yearsLeft;

        System.out.print("It's "+year+", so you can retire in "+retireYear+".");

    }
}
