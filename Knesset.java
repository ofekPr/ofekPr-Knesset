public class Knesset {
    private Mp[] members;
    private int memberCount;
    private String[] boards;
    private int numBoards;
    private final String[] coalitionParties;
    public Knesset(String[] coalitionParties) {
        this.coalitionParties = new String[coalitionParties.length];
        for (int i=0; i<coalitionParties.length ; i++)
            this.coalitionParties[i] = coalitionParties[i];
        boards = new String[30];
        numBoards = 0;
        members = new Mp[3];
        memberCount = 0;
    }

    public int getNumBoards() { return numBoards; }

    public boolean addMember(Mp member) {
        if (memberCount < members.length) {
            members[memberCount] = member;
            memberCount++;
            return true;
        }
        return false;
    }

    public boolean isInCoalition(String mpName) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMpName().equals(mpName)) {
                for (int j = 0; j < coalitionParties.length; j++) {
                    if (members[i].getPartyName().equals(coalitionParties[j])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
