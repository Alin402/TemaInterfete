public class Main {
    public static void main(String[] args) {
        DevTeam devTeam = new DevTeam();
        HR hrTeam = new HR();

        Membru liderNeEligibil = new Membru("membru", "neeligibil", 14, 1234, 1);
        devTeam.setLeader(liderNeEligibil);
        Membru liderDevTeam = new Membru("Popescu", "Andrei", 23, 100000, 6);
        devTeam.setLeader((liderDevTeam));
        Membru liderHRTeam = new Membru("Georgescu", "George", 25, 1000000, 7);
        hrTeam.setLeader(liderHRTeam);

        Membru jucator1Dev = new Membru("jucatorDev", "1", 18, 12367, 2);
        Membru jucator2Dev = new Membru("jucatorDev", "2", 19, 1232, 1);
        Membru jucator3Dev = new Membru("jucatorDev", "3", 18, 12345, 4);
        Membru jucator4Dev = new Membru("jucatorDev", "4", 20, 45677, 6);
        Membru jucator5Dev = new Membru("jucatorDev", "5", 21, 3434, 1);
        devTeam.addMember(jucator1Dev);
        devTeam.addMember(jucator2Dev);
        devTeam.addMember(jucator3Dev);
        devTeam.addMember(jucator4Dev);
        devTeam.addMember(jucator5Dev);

        Membru jucator1HR = new Membru("jucatorHR", "1", 19, 14567, 4);
        Membru jucator2HR = new Membru("jucatorHR", "2", 19, 1262, 1);
        Membru jucator3HR = new Membru("jucatorHR", "3", 14, 11245, 4);
        Membru jucator4HR = new Membru("jucatorHR", "4", 21, 56677, 7);
        Membru jucator5HR = new Membru("jucatorHR", "5", 1, 33434, 1);
        hrTeam.addMember(jucator1HR);
        hrTeam.addMember(jucator2HR);
        hrTeam.addMember(jucator3HR);
        hrTeam.addMember(jucator4HR);
        hrTeam.addMember(jucator5HR);

        System.out.println(devTeam.getCost());
        System.out.println(hrTeam.getCost());
        System.out.println(devTeam.toString());
        System.out.println(hrTeam.toString());

        devTeam.removeMember(jucator1Dev);
        hrTeam.removeMember(jucator2HR);

        System.out.println(devTeam.getCost());
        System.out.println(hrTeam.getCost());
        System.out.println(devTeam.toString());
        System.out.println(hrTeam.toString());
    }
}
