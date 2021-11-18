class Programming
{
    Programming()
    {
        System.out.println("I Love Programming");
    }

    Programming(String str)
    {
        System.out.println("I Love " + str);
    }


}

public class PrintString {
    public static void main(String[] args) {
        Programming p1 = new Programming();
        Programming p2 = new Programming("Java");
    }
}
