import java.util.ArrayList;

public class Edicao {
    public int nroEdi;
    public int volumeEdi;

    public ArrayList<Artigo> artigos;

    public Edicao(int nroEdi, int volumeEdi) {
        this.setNroEdi(nroEdi);
        this.setVolumeEdi(volumeEdi);
        this.artigos = new ArrayList<>();
    }

    public boolean addArtigo(Artigo art){
        if(this.artigos.add(art))
            return true;
        else
            return false;
    }

    public int getNroEdi() {
        return nroEdi;
    }

    public void setNroEdi(int nroEdi) {
        this.nroEdi = nroEdi;
    }

    public int getVolumeEdi() {
        return volumeEdi;
    }

    public void setVolumeEdi(int volumeEdi) {
        this.volumeEdi = volumeEdi;
    }

    public String Consulta(){
        return "Edição: " + this.getNroEdi() + " Volume: " + this.getVolumeEdi();
    }
}
