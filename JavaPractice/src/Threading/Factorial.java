package Threading;

public class Factorial implements Runnable{
    int item;

    public Factorial(int item)
    {
        this.item = item;
    }
    @Override
    public void run() {
         factorial();
    }
    private  void factorial() {
        int output = 1;
        for (int i = 2; i <=this.item ; i++) {
            output *= i;
        }
        System.out.println("factorial of a number "+item+" is "+ output+"" +
                " calculated by thread "+ Thread.currentThread().getName());;
    }
}
