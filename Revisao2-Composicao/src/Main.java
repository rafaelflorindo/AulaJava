//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RevistaCientifica rv = new RevistaCientifica("123456", "Tecnologia e CIA");
        rv.addEdicoes(new Edicao(1, 1));
        rv.addEdicoes(new Edicao(1, 2));
        rv.addEdicoes(new Edicao(1, 3));
        rv.addEdicoes(new Edicao(2, 1));
        rv.addEdicoes(new Edicao(2, 2));
        rv.addEdicoes(new Edicao(2, 3));

        rv.consultar();
    }
}