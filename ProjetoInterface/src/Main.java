//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro creta = new Carro();
        creta.addVeiculo("Creta Turbo", "125", "V8", "2.0");
        System.out.println(creta.getId());
        System.out.println(creta.getNome());
        System.out.println(creta.getMarca());
        System.out.println(creta.getCilindras());
    }
}