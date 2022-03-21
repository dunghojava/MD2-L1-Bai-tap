import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So can doc:");
        int number = scanner.nextInt();
        int phanChuc = number / 10;
        int a = number / 100;
        int b = number - a * 100;
        int phanChuc2 = b / 10;
        int phanTram = number / 100;
        if (number >= 0) {
            if (number < 13) {
                switch (number) {
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                    case 10:
                        System.out.println("ten");
                        break;
                    case 11:
                        System.out.println("eleven");
                        break;
                    case 12:
                        System.out.println("twelve");
                        break;
                }
            } else if (number < 20) {
                switch (number) {
                    case 13:
                        System.out.println("thirdteen");
                        break;
                    case 14:
                        System.out.println("fourteen");
                        break;
                    case 15:
                        System.out.println("fifteen");
                        break;
                    case 16:
                        System.out.println("sixteen");
                        break;
                    case 17:
                        System.out.println("seventeen");
                        break;
                    case 18:
                        System.out.println("eighteen");
                        break;
                    case 19:
                        System.out.println("nineteen");
                        break;
                }
            } else if (number < 100) {
                switch (phanChuc) {
                    case 3:
                        System.out.print("Thirdty ");
                        break;
                    case 4:
                        System.out.print("Fourty ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("Eighty ");
                        break;
                    case 9:
                        System.out.print("Ninety ");
                        break;
                }
                switch (number % 10) {
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
            } else if (number < 1000) {
                switch (phanTram) {
                    case 1:
                        System.out.print("one hundred and ");
                        break;
                    case 2:
                        System.out.print("two hundred and ");
                        break;
                    case 3:
                        System.out.print("three hundred and ");
                        break;
                    case 4:
                        System.out.print("four hundred and ");
                        break;
                    case 5:
                        System.out.print("five hundred and ");
                        break;
                    case 6:
                        System.out.print("six hundred and ");
                        break;
                    case 7:
                        System.out.print("seven hundred and ");
                        break;
                    case 8:
                        System.out.print("eight hundred and ");
                        break;
                    case 9:
                        System.out.print("night hundred and ");
                        break;
                }
                switch (phanChuc2) {
                    case 3:
                        System.out.print(" Thirdty ");
                        break;
                    case 4:
                        System.out.print(" Fourty ");
                        break;
                    case 5:
                        System.out.print(" Fifty ");
                        break;
                    case 6:
                        System.out.print(" Sixty ");
                        break;
                    case 7:
                        System.out.print(" Seventy ");
                        break;
                    case 8:
                        System.out.print(" Eighty ");
                        break;
                    case 9:
                        System.out.print(" Ninety ");
                        break;
                }
                switch (number % 10) {
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
            }

        } else {
            System.out.println("Out of ability");
        }
    }
}
