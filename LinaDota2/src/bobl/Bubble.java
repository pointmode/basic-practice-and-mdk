package bobl;

public class Bubble {
    public static void main(String[] args)
    {
        Sort one = new Sort(6);
        one.add(66);
        one.add(4);
        one.add(0);
        one.add(543);
        one.add(5);
        one.add(77);
        // one.bubble();
        one.display();
        one.bubble();
        one.display();
    }
}