package HackerRank;

import java.util.Scanner;

class hurdle_Race {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int height[] = new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int max = height[0];
        int diff = 0;
        for(int i =0;i<n;i++){
            if(height[i]>max){
                max=height[i];
                if(max > k){
                    diff = max - k;
                }
            }
        }
        System.out.println(diff);
        sc.close();
    }
}