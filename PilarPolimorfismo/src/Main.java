//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ferrari ferrariHeverton = new Ferrari("Ferrari c800", "Vermelho Barraco", 500000.00, "BMW");
        System.out.println(ferrariHeverton);
        ferrariHeverton.aumentarPreco(5.0);
        System.out.println(ferrariHeverton);

        Fusca fuscaRafael = new Fusca("Fusca 1300", "Branco", 5000.00, "VolskWagem");
        System.out.println(fuscaRafael);
        fuscaRafael.aumentarPreco(3.0);
        System.out.println(fuscaRafael);

        Gol golAlan = new Gol("Gol G5", "Preto", 50000.00, "VolskWagem");
        System.out.println(golAlan);
        golAlan.aumentarPreco(1.0);
        System.out.println(golAlan);
    }
}