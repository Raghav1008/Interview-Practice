package Algorithms.String_practice;

import java.util.Scanner;

public class change_String {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        if(str.charAt(0)>= 'a' && str.charAt(0)<= 'z'){
            System.out.println(str.toLowerCase());
        }
        else{
            System.out.println(str.toUpperCase());
        }
    }
}
