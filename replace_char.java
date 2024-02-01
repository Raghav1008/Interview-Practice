package Algorithms;

public class replace_char {
    public static void main(String[] args) {
        String s1 = "computer";
        String s2 = "cat";
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(s2.indexOf(c)==-1){
                str.append(c);
            }
            System.out.println(str.toString());
        }
        }
}
