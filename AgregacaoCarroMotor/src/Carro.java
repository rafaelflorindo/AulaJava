import java.util.ArrayList;
import java.util.List;

public class Carro {
    public String modelo;
    public String fabricante;
    public String placa;
    public Motor motor;

    public List<Roda> rodas;

    public Carro(String modelo, String fabricante, String placa) {
        this.setModelo(modelo);
        this.setFabricante(fabricante);
        this.setPlaca(placa);
        rodas = new ArrayList<>();
    }

    public void adicionarMotor(Motor motor){//é aqui que ocorre a agregação
        this.motor = motor;
    }

    public void adicionarRoda(Roda roda){
        this.rodas.add(roda);
    }

    public void removerRoda(int index){
        this.rodas.remove(index);
    }

    public void alterarRoda(Roda roda, int index){
        this.rodas.set(index, roda);
    }

    public void listarRodas(){
        System.out.print("**************************************************");
        System.out.print("\nRodas vinculada ao veículo");
        int i = 1;
        for (Roda roda: rodas) {
            System.out.print("\nRoda: " + i);
            System.out.print(" Fabricante: " + roda.getFabricante());
            System.out.print(" Aro: " + roda.getAro());
            System.out.print(" Tipo: " + roda.getTipo());
            i++;
        }
    }

    public String detalharCarro(){
        return "Modelo: " + this.getModelo()+
                " Fabricante:" + this.getFabricante() +
                " Placa: " + this.getPlaca() + "\nMotor:" + this.getMotor().retornaMotor();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motor getMotor() {
        return motor;
    }
}
