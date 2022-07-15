public class Slytherin extends Hogwarts{
    private int trickery;
    private int resolve;
    private int ambition;
    private int resourcefulness;
    private int authorityHunger;

    public Slytherin(String firstName, String lastName, int magicPower, int teleportRange, int trickery, int resolve, int ambition, int resourcefulness, int authorityHunger) {
        super(firstName, lastName, magicPower, teleportRange);
        this.trickery = trickery;
        this.resolve = resolve;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authorityHunger = authorityHunger;
    }

    public int getTrickery() {
        return trickery;
    }

    public void setTrickery(int trickery) {
        this.trickery = trickery;
    }

    public int getResolve() {
        return resolve;
    }

    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAuthorityHunger() {
        return authorityHunger;
    }

    public void setAuthorityHunger(int authorityHunger) {
        this.authorityHunger = authorityHunger;
    }
    public void getBestSlytherinStudent(Slytherin slytherin) {
        String studentA = slytherin.getFirstName() + " " + slytherin.getLastName();
        String studentB = this.getFirstName() + " " + this.getLastName();
        int pointsA = slytherin.getMagicPower() + slytherin.getTeleportRange() + points();
        int pointsB = this.getMagicPower() + this.getTeleportRange() + this.points();
        System.out.print("Между студентами: " + studentA + "(" + pointsA + ")" + " и " + studentB + "(" + pointsB + ")");
        if (pointsA > pointsB) {
            System.out.println(" победу одержал: " + studentA);
        } else {
            System.out.println(" победу одержал: " + studentB);
        }
    }
    private int points () {
        return authorityHunger + resourcefulness + ambition + resolve + trickery;
    }
}
