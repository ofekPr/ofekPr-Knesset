public class Mp {
    private String mpName;
    private String partyName;
    private String[] boards;
    private int numBoards;

    public Mp(String mpName, String partyName) {
        this.mpName = mpName;
        this.partyName = partyName;
        this.boards= new String[30];
        this.numBoards = 0;
    }

    public String getMpName() { return mpName; }
    public void setMpName(String mpName) { this.mpName = mpName; }
    public String getPartyName() { return partyName; }
    public void setPartyName(String partyName) { this.partyName = partyName; }
    public int getNumBoards() { return numBoards; }

    public boolean addCommittee(String name) {
        if (numBoards < boards.length) {
            boards[numBoards] = name;
            numBoards++;
            return true;
        }
        return false;
    }

    public boolean isInCommittee(String committeeName) {
        for (int i = 0; i < numBoards; i++) {
            if (boards[numBoards].equals(committeeName)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.mpName + " is in the " + this.partyName + ". He takes part in " + this.numBoards + " boards.";
    }
}
