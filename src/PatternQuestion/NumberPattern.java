package PatternQuestion;
//You are given a number n. You need to print the pattern for the given value of n.
//
//        For n = 2 the pattern will be
//2 2 1 1
//2 1
//
//For n = 3 the pattern will be
//3 3 3 2 2 2 1 1 1
//3 3 2 2 1 1
//3 2 1
public class NumberPattern {
   static void printPat(int n) {
        // Your code here
        int k = n;
        int s = 0;
        while(k>0)
        {
            for(int i = n;i>0;i--)
            {
                for(int j = n-s;j>0;j--)
                {
                    System.out.print(i);
                }
            }
            s++;
            System.out.println();
            k--;
        }
    }
    public static void main(String[] args) {
        printPat(2);
    }
}
