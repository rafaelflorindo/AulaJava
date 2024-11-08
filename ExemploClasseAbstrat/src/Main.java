//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaPoupanca c1 = new ContaPoupanca();
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
    }
}