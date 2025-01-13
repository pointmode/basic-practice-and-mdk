package sortemployee;

public class Salary {
    public static int getRandomSalary()
    {
        int min= 1000;
        int max= 10000;
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}
