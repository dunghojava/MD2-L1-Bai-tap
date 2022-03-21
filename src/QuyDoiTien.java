import java.util.Scanner;

public class QuyDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so tien USD: ");
        double quy_doi_vnd = 23000;
        double usd = scanner.nextDouble();
        double vnd = usd * quy_doi_vnd;
        System.out.printf("Menh gia VND la: " + vnd);
    }
}
