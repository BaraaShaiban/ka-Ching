public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++)
        {
            if (i % 15 == 0) //  multiple of 3 & 5?
                System.out.println("ka-ching!");
            else if (i % 3 == 0) //  multiple of 3?
                System.out.println("ka");
            else if (i % 5 == 0) //  multiple of 5?
                System.out.println("ching");
            else
                System.out.println(i);
        }
    }
}