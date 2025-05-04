import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;

        Scanner entrada = new Scanner(System.in); // Cria objeto Scanner para leitura do teclado

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Mostrar Tabuada");
            System.out.println("0 - Sair");

            System.out.print("Digite sua opção: ");
            opcao = entrada.nextInt();

            int a = 0;
            int b = 0;

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                a = entrada.nextInt();
                System.out.print("Digite o segundo número: ");
                b = entrada.nextInt();
            } else if (opcao == 5) {
                System.out.print("Digite o número da tabuada: ");
                a = entrada.nextInt();
            }

            switch (opcao) {
                case 1:
                    somar(a, b);// chama o metodo de somar
                    break;
                case 2:
                    subtrair(a, b);// chama o metodo de subtrair
                    break;
                case 3:
                    multiplicar(a, b);// chama o metodo de multiplicar
                    break;
                case 4:
                    dividir(a, b);// chama o metodo de dividir
                    break;
                case 5:
                    mostrarTabuada(a);// chama o metodo de mostrarTaboada
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0); // Condição correta para manter o menu

        entrada.close(); // Libera recurso do Scanner
    }

    public static void somar(int a, int b) {
        System.out.println("Resultado: " + (a + b));
    }

    public static void subtrair(int a, int b) {
        System.out.println("Resultado: " + (a - b));
    }

    public static void multiplicar(int a, int b) {
        System.out.println("Resultado: " + (a * b));
    }

    public static void dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Não é possível dividir por zero.");
        } else {
            System.out.println("Resultado: " + (a / b));
        }
    }

    public static void mostrarTabuada(int a) {
        System.out.println("Tabuada do " + a + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }

}