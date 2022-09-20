public class Main {
    public static void main(String[] args) {
        final String[] COALITION = {"Likud", "KL", "YA"};
        Knesset k = new Knesset(COALITION);
        Mp ofek = new Mp("Ofek", "Likud");
        Mp ido = new Mp("Ido", "KL");
        Mp almog = new Mp("Almog", "Kadima");
        ofek.addCommittee("Education");
        ofek.addCommittee("Money");
        ofek.addCommittee("Sports");
        ido.addCommittee("Money");
        ido.addCommittee("Economy");
        almog.addCommittee("Economy");
        almog.addCommittee("Money");
        almog.addCommittee("Life");
        k.addMember(ofek);
        k.addMember(almog);
        k.addMember(ido);

        System.out.println(ofek);
        System.out.println(ido);
        System.out.println(almog);

        System.out.println("Ofek is in the coalition: " + k.isInCoalition("Ofek"));
        System.out.println("almog is in the coalition: " + k.isInCoalition("Almog"));
    }
}