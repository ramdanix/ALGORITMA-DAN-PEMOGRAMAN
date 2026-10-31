package operatorpenugasan;

public class OperatorPenugasan {
    public static void main(String[] args) {
        int angka = 10;

        System.out.println("==========================================");
        System.out.println("   DEMO OPERATOR PENUGASAN (ASSIGNMENT)   ");
        System.out.println("==========================================");
        System.out.println("Nilai awal angka\t: " + angka);

        // Operator +=
        angka += 5;
        System.out.println("Setelah += 5\t\t: " + angka);

        // Operator -=
        angka -= 3;
        System.out.println("Setelah -= 3\t\t: " + angka);

        // Operator *=
        angka *= 2;
        System.out.println("Setelah *= 2\t\t: " + angka);

        // Operator /=
        angka /= 4;
        System.out.println("Setelah /= 4\t\t: " + angka);

        // Operator %=
        angka %= 4;
        System.out.println("Setelah %= 4\t\t: " + angka);
        System.out.println("==========================================");
    }
}