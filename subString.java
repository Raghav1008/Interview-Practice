package Algorithms.String_practice;

import java.util.Scanner;

public class subString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(str.substring(l, r));        
    }
    
}
