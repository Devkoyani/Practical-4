public class A4_Prac1 {
    public static void main(String[] args) {
        // int x = 10;
        int y = 6;
        int z[] = { 5, 2, 0 };
        System.out.println("Start ");
        try {
            System.out.println("First ");
            try {
                System.out.println("Second ");
                z[3] = 50;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("First catch. ");
                System.out.println("Error : " + e);
            }
            System.out.println("First try.....catch ended. \n");
            z[2] = y / 0;
        } catch (ArithmeticException e) {
            System.out.println("Second catch. ");
            System.out.println("Error : " + e);
        }
        System.out.println("Program is Ended");
    }
}