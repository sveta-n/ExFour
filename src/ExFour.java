import java.util.Scanner;

public class ExFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, z, xyz;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        xyz = (x + y + z) / 3; // среднее арифметическое значение чисел x, y и z
        System.out.println(xyz);
        double d = xyz / 2; // деление на 2 и округление в меньшую сторону
        //System.out.println(Math.floor(d));

        if (d > 3) {
            System.out.println("Программа исполнена коррктно");
        }
    }

}