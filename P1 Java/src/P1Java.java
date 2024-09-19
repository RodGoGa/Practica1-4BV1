/**
 *
 * @author Rodrigo González Garcés 4BV1
 */
import java.util.*;
public class P1Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //2 formulas para el cuadrado
        System.out.println("Formulas para el cuadrado");
        System.out.println("Ingresa los metros de largo del cuadrado: ");
        float ladoCuadrado = Float.parseFloat(input.nextLine());
        float ladoCuadradoCm = ladoCuadrado*100;
        //Área del cuadrado
        System.out.println("    El área del cuadrado en cm es: " + ladoCuadradoCm*ladoCuadradoCm + "cm^2");
        //Perimetro del cuadrado
        System.out.println("    El perimetro del cuadrado en cm es: " + ladoCuadradoCm*4 + "cm");

        System.out.println();
        System.out.println("Formula para el área del triángulo en m:");
        System.out.println("Ingresa el alto del triangulo");
        float altoTriangulo = Float.parseFloat(input.nextLine());
        System.out.println("Ingresa la base del triángulo");
        float baseTriangulo = Float.parseFloat(input.nextLine());
        float altoTrianguloCm = altoTriangulo*100;
        float baseTrianguloCm = baseTriangulo*100;
        //Área del triángulo
        System.out.println("    El área del triangulo es: " + (baseTrianguloCm*altoTrianguloCm)/2 + "cm^2");
        System.out.println();

        System.out.println("Formulas para el circulo");
        System.out.println("Ingresa el diametro del circulo en m: ");
        float diametroCirculo = Float.parseFloat(input.nextLine());
        float diametroCirculoCm = diametroCirculo * 100;
        //Área del circulo
        System.out.println("    El área del circulo es: " + (3.1415*(diametroCirculoCm*diametroCirculoCm))/4 + "cm^2");
        //Perimetro del circulo
        System.out.println("    El perimetro del circulo es: " + 3.1415*diametroCirculoCm + "cm");
        System.out.println();
        System.out.println("Se usaron 5 formulas diferentes");
    }
}
