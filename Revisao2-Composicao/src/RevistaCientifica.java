import java.util.ArrayList;
import java.util.Objects;

public class RevistaCientifica {
    private String issnRev;
    private String titRev;
    public ArrayList<Edicao> edicoes;

    public RevistaCientifica(String issnRev, String titRev) {
        this.setIssnRev(issnRev);
        this.setTitRev(titRev);
        this.edicoes = new ArrayList<>();
    }

    public boolean addEdicoes(Edicao ed){
        if(this.edicoes.add(ed))
            return true;
        else
            return false;
    }

    public boolean registrar(){
        return true;
    }

    public void consultar(){
        /*if(Objects.equals(issnRev, this.getIssnRev())){*/
            System.out.println("Revista: " + this.getTitRev());
            System.out.println("ISSN: " + this.getIssnRev());
            System.out.println("Edições ");

            for(Edicao ed : edicoes) {
                System.out.println(ed.Consulta());
            }
    }

    public String getIssnRev() {
        return issnRev;
    }

    public void setIssnRev(String issnRev) {
        this.issnRev = issnRev;
    }

    public String getTitRev() {
        return titRev;
    }

    public void setTitRev(String titRev) {
        this.titRev = titRev;
    }

}
