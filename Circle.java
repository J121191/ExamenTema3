import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el radio del círculo:");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.printf("El área del círculo es: %.2f\n", area);
        System.out.printf("El perímetro del círculo es: %.2f\n", perimetro);

        sc.close();
    }
}