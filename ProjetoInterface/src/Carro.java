public class Carro implements Veiculo, Motor{
    private String nome;
    private String id;

    private String marca;
    private String cilindrada;

    @Override
    public boolean addVeiculo(String nome, String id, String marca, String cilindrada) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.cilindrada = cilindrada;
        return true;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public String getCilindras() {
        return this.cilindrada;
    }
}

