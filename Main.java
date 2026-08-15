import java.util.Scanner;

public class Funcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcaoMenu;
        double totalEstoque = 0;
        int quantidadeAdd;
        int quantidadeRemover;

        System.out.println("=====================================");
        System.out.println("Sistema Gerenciador de Estoque - SGE");
        System.out.println("=====================================");


        System.out.println("\nInsira os dados iniciais do produto");
        System.out.print("Nome: ");
        String nomeProduto = sc.nextLine();
        System.out.print("Preço: ");
        double precoProduto = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidadeProduto = sc.nextInt();
        System.out.println("Produto cadastrado!");

        System.out.print("\nPressione enter para continuar ao menu...");
        sc.nextLine();

        do {
            sc.nextLine();
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar estoque");
            System.out.println("2. Remover estoque");
            System.out.println("3. Dados de valores do estoque");
            System.out.println("4. Dados completos do estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.print("\nQuantos produtos deseja adicionar? ");
                    quantidadeAdd = sc.nextInt();

                    if(quantidadeAdd>0){
                        quantidadeProduto += quantidadeAdd;
                        System.out.println("\nEstoque atualizado!");
                        System.out.println("Quantidade atual: " + quantidadeProduto);
                    }
                    else{
                        System.out.println("Quantidade inválida");
                    }

                    System.out.print("\nPressione enter para continuar ao menu...");
                    sc.nextLine();
                    break;

                case 2:
                    System.out.print("\nInforme a quantidade do produto que deseja remover: ");
                    quantidadeRemover = sc.nextInt();

                    if (quantidadeRemover <= quantidadeProduto) {
                        quantidadeProduto -= quantidadeRemover;
                        System.out.println("\nEstoque atualizado!");
                        System.out.println("Quantidade atual: " + quantidadeProduto);
                    }
                    else{
                        System.out.println("Quantidade inválida");
                    }
                    System.out.print("\nPressione enter para continuar ao menu...");
                    sc.nextLine();
                    break;

                case 3:
                    totalEstoque = precoProduto * quantidadeProduto;
                    System.out.printf("\nValor total do estoque: R$%.2f\n", totalEstoque);
                    System.out.print("\nPressione enter para continuar ao menu...");
                    sc.nextLine();
                    break;

                case 4:
                    mostrarProduto(nomeProduto, precoProduto, quantidadeProduto);
                    System.out.println("\nPressione enter para continuar ao menu...");
                    sc.nextLine();
                    break;
            }

        }while(opcaoMenu != 5);

        sc.close();
    }

    public static void mostrarProduto(String nome, double preco, int qtd){
        System.out.println("\n===============================");
        System.out.println("Dados do produto em estoque");
        System.out.printf("Nome: %s", nome);
        System.out.printf("\nPreço unitário: R$%.2f", preco);
        System.out.println("\nQuantidade em estoque: " + qtd + " unidades");
    }
}
