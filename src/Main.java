public class Main {
    public static void main(String[] args) {
        System.out.println(hash("alex"));
    }

    //Задание 1. Реализовать простейшую хеш-функцию.
    public static int hash(String string) {
        int a = 0;
        for (int i = 0; i < string.length(); i++) {
            a = 31 * a + string.charAt(i);
        }
        return a;
    }
}
