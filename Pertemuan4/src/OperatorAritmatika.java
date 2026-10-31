public class OperatorAritmatika {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        int c = 5;

        // Hitung
        int hasil1 = a + b - c;
        int hasil2 = a * b / c;
        int hasil3 = a + b * c;
        int hasil4 = a + b / c;
        int hasil5 = (a + b) * c;
        int hasil6 = (a - b) * c;
        int hasil7 = a % b;

        // Cetak hasil
        System.out.println("a + b - c \t= " + hasil1);
        System.out.println("a * b / c \t= " + hasil2);
        System.out.println("a + b * c \t= " + hasil3);
        System.out.println("a + b / c \t= " + hasil4);
        System.out.println("(a + b) * c \t= " + hasil5);
        System.out.println("(a - b) * c \t= " + hasil6);
        System.out.println("a % b \t\t= " + hasil7);
    }
}