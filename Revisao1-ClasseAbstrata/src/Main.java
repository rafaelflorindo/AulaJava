import empregado.Chefe;
import empregado.Comissionado;

public class Main {
    public static void main(String[] args) {
        Chefe ronie = new Chefe();

        ronie.setNome("Ronie Tokumoto");
        ronie.setEndereco("Rua Tiririka");
        ronie.setSalarioMensal(5000.00);
        System.out.println("Chefe: " + ronie.getNome());
        System.out.println("BatCaverna: " + ronie.getEndereco());
        System.out.println("Salário Base R$ " + ronie.getSalarioMensal());
        System.out.println("Salário Base + gratificação R$ " + ronie.calcularSalario());

        Comissionado luiz = new Comissionado();
        luiz.setNome("Luiz");
        luiz.setEndereco("Rua Jackson Antunes");
        luiz.setComissao(2.0);
        luiz.setSalarioBase(2500.00);
        System.out.println("*****************************************************");
        System.out.println("Comissionado: " + luiz.getNome());
        System.out.println("BatCaverna: " + luiz.getEndereco());
        System.out.println("Salário Base R$ " + luiz.getSalarioBase());
        System.out.println("Comissão R$ " + luiz.getComissao());
        System.out.println("Salário Base + comissão R$ " + luiz.calcularSalario());

    }
}