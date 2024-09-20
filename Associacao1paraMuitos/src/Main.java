//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ClientePessoaFisica rafaelFisica = new ClientePessoaFisica("Rafael Florindo", "4498401-4320","123.456.789.78");
        Conta contaRafael = new Conta("123", "00");
        Conta contaRafael1 = new Conta("456", "00");
        rafaelFisica.setConta(contaRafael);
        rafaelFisica.setConta(contaRafael1);
        System.out.println(rafaelFisica);
    }
}