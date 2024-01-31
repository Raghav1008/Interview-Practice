 package Algorithms.String_practice;

class goal_Parser {
    public static void main(String[] args) {
        String s = "G()()()()(al)";
        String str = s.replace("()","o")
                      .replace("(al)","al");
        System.out.println(str);
    }

    
}