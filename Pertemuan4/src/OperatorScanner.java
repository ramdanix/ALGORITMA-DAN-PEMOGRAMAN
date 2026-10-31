import java.util.Scanner;

public class OperatorScanner {
    public static void main(String[] args) {
        String Nama;
        Scanner ok = new Scanner(System.in);

        System.out.print("Inputkan Nama Anda: ");
        Nama = ok.nextLine();
        System.out.println("Hello " + Nama);
    }
}