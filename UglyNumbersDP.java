import java.util.*;
class ugly {
    public static int maxDivide(int a, int b) {
        while(a%b == 0) {
            a /= b;
        }
        return a;
    }
    
    public static int findNthUgly(int n) {
        int count = 0;
        int i=0;
        for(i=1;count<n;i++) {
            int num = i;
            num = maxDivide(num, 2);
            num = maxDivide(num, 3);
            num = maxDivide(num, 5);
            if(num == 1)
                ++count;
        }        
        return i-1;
    }
    
    public static void main(String[] args) {
        System.out.println(findNthUgly((new Scanner(System.in)).nextInt()));
    }
}
