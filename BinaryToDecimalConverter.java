import java.util.Scanner;

public class BinaryToDecimalConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma sequência de até 8 dígitos binários (apenas 0 e 1): ");
            String input = scanner.nextLine();

            if (!input.matches("[01]{1,8}")) {
                System.out.println("Entrada inválida. Certifique-se de inserir apenas dígitos binários (0 ou 1) e no máximo 8 dígitos.");
                continue;
            }

            int decimalValue = convertBinaryToDecimal(input);

            System.out.println("O equivalente decimal é: " + decimalValue);

            System.out.print("Deseja converter outro número? (s/n): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("s")) {
                System.out.println("Encerrando o programa. Até mais!");
                break;
            }
        }

        scanner.close();
    }

    /**
     * Converte uma sequência de dígitos binários em decimal.
     * @param binaryString a sequência binária
     * @return o valor decimal
     */
    private static int convertBinaryToDecimal(String binaryString) {
        int decimalValue = 0;
        int length = binaryString.length();

        for (int i = 0; i < length; i++) {
            char digit = binaryString.charAt(i);
            int binaryDigit = Character.getNumericValue(digit);

            decimalValue += binaryDigit * Math.pow(2, length - 1 - i);
        }

        return decimalValue;
    }
}
