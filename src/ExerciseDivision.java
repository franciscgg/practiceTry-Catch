import java.util.Scanner;

public class ExerciseDivision {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite o numerador:");
        int numerador = scanner.nextInt();

        System.out.println("Digite o denominador: ");
        int denominador = scanner.nextInt();

        try{
            int resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero não permitida.");
        }
    }
}
