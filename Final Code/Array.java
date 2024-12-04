public class Array {
    public static void main(String[] args) {
        int number[] = { 10, 20, 30, 40, 50 };
        System.out.println("index of the " + number[0]);
        System.out.println("index of the " + number[1]);
        number[2] = 200;
        System.out.println("updated number of the array index is : " + number[2]);
        System.out.println("all the elements of the array");

        for (int i = 0; i < number.length; i++) {
            System.out.println("index" + i + ":" + number[i]);
        }
    }
}
