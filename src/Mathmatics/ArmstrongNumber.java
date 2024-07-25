package Mathmatics;

public class ArmstrongNumber {
    static long cube(long n)
    {
        return n*n*n;
    }
    static  boolean isArmstrong(long num)
    {
        long rem = 0;
        long temp = num;
        long newNum = 0;
        while (temp>0)
        {
            rem = temp%10;
            newNum += cube(rem);
            temp = temp/10;
        }
        return newNum==num;
    }
    public static void main(String[] args) {
        long num = 153;
        System.out.println(isArmstrong(num));
    }
}
