public class HR extends Echipa {
    HR() {
        super("DevTeam", 12);
    }
    public double getCost() {
        double totalCost = 0;
        for(Membru member : listaMembrii) {
            if(member.equals(lider)) {
                totalCost += member.aniExp * 300 + 1350;
            } else {
                double bonusProcentual = 0.0;
                int exp = member.aniExp;
                if(exp >= 2 && exp <= 5) {
                    bonusProcentual = (double) 25 / 100;
                } else if(exp > 5) {
                    bonusProcentual = (double) 50 / 100;
                }
                totalCost += 1000 + bonusProcentual * 1000;
            }
        }
        return totalCost;
    }
}
