import java.util.ArrayList;

public abstract class Echipa {
    private String nume;
    private int nrMaxMembrii;
    public Membru lider;
    ArrayList<Membru> listaMembrii = new ArrayList<Membru>();

    Echipa() {}

    public Echipa(String nume, int nrMaxMembrii) {
        this.nume = nume;
        this.nrMaxMembrii = nrMaxMembrii;
    }

    public Boolean addMember(Membru member) {
        if(listaMembrii.size() == nrMaxMembrii) {
            return false;
        }
        listaMembrii.add(member);
        return true;
    }

    public Boolean setLeader(Membru liderNou) {
        if(liderNou.aniExp >= 5) {
            this.lider = liderNou;
            return true;
        }
        return false;
    }

    public Membru removeMember(Membru member) {
        if(listaMembrii.contains(member)) {
            listaMembrii.remove(member);
            return member;
        }
        return null;
    }

    public String toString() {
        String teamString = String.format("Lider: %s %s\n", this.lider.nume, this.lider.prenume);
        for(Membru member : listaMembrii) {
            teamString = teamString + member.nume + " " + member.prenume + '\n';
        }
        return teamString;
    }

    public void setNrMaxMembrii(int nrMaxMembrii, Membru member) {
        if(member.equals(lider)) {
            this.nrMaxMembrii = nrMaxMembrii;
        } else {
            System.out.println("Doar liderul poate seta numarul maxim de membrii ai echipei");
        }
    }

    public void setNume(String nume, Membru member) {
        if(member.equals(lider)) {
            this.nume = nume;
        } else {
            System.out.println("Doar liderul poate seta numele echipei");
        }
    }

    public abstract double getCost();
}
