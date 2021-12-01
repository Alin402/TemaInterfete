public class DevTeam extends Echipa {
    DevTeam() {
        super("DevTeam", 12);
    }
    public double getCost() {
        double totalCost = 0;
        for(Membru member : listaMembrii) {
            if(member.equals(lider)) {
                totalCost += member.aniExp * 250 + 2500;
            } else {
                double bonusProcentual = 0.0;
                int exp = member.aniExp;
                if(exp >= 2 && exp <= 5) {
                    bonusProcentual = (double) 25 / 100;
                } else if(exp > 5) {
                    bonusProcentual = (double) 50 / 100;
                }
                totalCost += 1500 + bonusProcentual * 1500;
            }
        }
        return totalCost;
    }
}
