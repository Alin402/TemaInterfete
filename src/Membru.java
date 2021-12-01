public class Membru {
    public String nume;
    public String prenume;
    int varsta;
    int salariu;
    int aniExp;

    Membru(String nume, String prenume, int varsta, int salariu, int aniExp) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.salariu = salariu;
        this.aniExp = aniExp;
    }

    public boolean equals(Object o){
        if(!(o instanceof Membru)){
            return false;
        }
        if(o == null){
            return false;
        }
        Membru membruAux = (Membru) o;
        return this.nume == membruAux.nume
                && this.prenume == membruAux.prenume
                && this.varsta == membruAux.varsta
                && this.salariu == membruAux.salariu
                && this.aniExp == membruAux.aniExp;
    }
}
