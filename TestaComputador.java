import java.util.Scanner;

public class TestaComputador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computador[] computadores = new Computador[2];

        System.out.println("Cadastro de Computadores - Preencha os dados\n");

        for (int i = 0; i < computadores.length; i++) {
            System.out.println("\nComputador " + (i + 1));

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Memória RAM (GB): ");
            int ram = lerInt(scanner, "Memória RAM");

            System.out.print("Armazenamento (GB): ");
            int armazenamento = lerInt(scanner, "Armazenamento");

            System.out.print("Sistema Operacional: ");
            String so = scanner.nextLine();

            computadores[i] = new Computador(marca, modelo, ram, armazenamento, so);
        }

        scanner.close();

        System.out.println("\n=== RELATÓRIO FINAL ===");
        for (int i = 0; i < computadores.length; i++) {
            System.out.println("\nComputador " + (i + 1) + ":");
            System.out.println(computadores[i]);
        }
    }

    private static int lerInt(Scanner scanner, String campo) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Valor inválido para " + campo + ". Tente novamente: ");
            }
        }
    }
}