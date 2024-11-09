import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaPoupanca c1 = new ContaPoupanca();
        int op;

        do{
            System.out.println("1 - Criar conta");
            System.out.println("2 - Efetuar Depósito");
            System.out.println("3 - Apresentar Saldo");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção acima: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    sc.nextLine();
                    System.out.println("Informe o nome do Titular");
                    String titular = sc.nextLine();
                    System.out.println("Informe a variação da Poupança.");
                    String variacao = sc.nextLine();
                    c1.setTitular(titular);
                    c1.setVariacao(variacao);
                    break;
                case 2:
                    System.out.println("Informe o valor do depósito");
                    double valor = sc.nextDouble();
                    if(c1.deposito(valor))
                        System.out.println("Depósito de R$ " + valor + " efetuado com sucesso");
                    else
                        System.out.println("Erro ao efetuar o depósito! Confira o valor informado");

                    break;
                case 3:
                    c1.imprimeSaldo();
                    break;
                case 4:
                    break;

            }

        }while (op !=4);
        /*
        PRIMEIRA VERSÃO
        c1.setTitular("José de Almeida");
        c1.setVariacao("51");

        double valor = 500;
        if(c1.deposito(valor))
            System.out.println("Depósito de R$ " + valor + " efetuado com sucesso");
        else
            System.out.println("Erro ao efetuar o depósito! Confira o valor informado");

        c1.imprimeSaldo();

        valor = 800;
        if(c1.deposito(valor))
            System.out.println("Depósito de R$ " + valor + "  efetuado com sucesso");
        else
            System.out.println("Erro ao efetuar o depósito! Confira o valor informado");

        System.out.println("*****Após depósito*****");
        c1.imprimeSaldo();
        */
    }
}