import associacao.CPF;
import associacao.Pessoa;

public class Main {
    public static void main(String[] args) {
        CPF cpfRafael = new CPF("123.456.789-12");
        Pessoa pessoaRafael = new Pessoa("Rafael", cpfRafael);
        System.out.println("\nImprimindo através do objeto pessoaRafael");
        System.out.println(pessoaRafael);

        System.out.println("\nImprimindo através do objeto cpfRafael");
        System.out.println("Pessoa: " + cpfRafael.pessoa.getNome());
        System.out.println("CPF: " + cpfRafael.getNumCPF());
    }
}