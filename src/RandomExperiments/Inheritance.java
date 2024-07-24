package RandomExperiments;

public class Inheritance {
    Object sum()
    {
        return 8;
    }
}
class Inheritance1 extends Inheritance
{
    @Override
    String sum()// co varient return type in java
    {
        return "9";
    }
}
