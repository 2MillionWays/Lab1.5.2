package ross.goncharuk;


import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {
    static public void main(String[] args){

        System.out.print("-Enter Number x:");
        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        String number;
        switch (line){
            case "1": number ="-One";
                break;
            case "2": number ="-Two";
                break;
            case "3": number ="-Three";
                break;
            case "4": number ="-Four";
                break;
            case "5": number ="-Five";
                break;
            case "6": number ="-Six";
                break;
            case "7": number ="-Seven";
                break;
            case "8": number ="-Eight";
                break;
            case "9": number ="-Nine";
                break;
            default: number="-Other";
                break;
        }
        System.out.println(number);

    }
}
