public class A4_Prac3 {
    class Main {
        public static void main(String[] args) {
            try {
                int array[] = new int[10];
                array[10] = 30 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Finally block");
            }
        }
    }
}
