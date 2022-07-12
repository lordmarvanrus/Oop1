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
    public static void getBestStudent(String lastNameA, String lastNameB, Slytherin[] slytherins) {
        String studentA = null;
        String studentB = null;
        int pointsA = 0;
        int pointsB = 0;
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            if (lastNameA.equals(slytherin.getLastName())) {
                studentA = slytherin.getFirstName() + " " + slytherin.getLastName();
                pointsA = slytherin.getMagicPower() + slytherin.getTeleportRange() + slytherin.getTrickery() +
                        slytherin.getResolve() + slytherin.getAmbition() + slytherin.getResourcefulness() +
                        slytherin.getAuthorityHunger();
            }
            if (lastNameB.equals(slytherin.getLastName())) {
                studentB = slytherin.getFirstName() + " " + slytherin.getLastName();
                pointsB = slytherin.getMagicPower() + slytherin.getTeleportRange() + slytherin.getTrickery() +
                        slytherin.getResolve() + slytherin.getAmbition() + slytherin.getResourcefulness() +
                        slytherin.getAuthorityHunger();
            };
        }
        System.out.print("Между студентами: " + studentA + "(" + pointsA + ")" + " и " + studentB + "(" + pointsB + ")");
        if (pointsA > pointsB) {
            System.out.println(" победу одержал: " + studentA);
        } else {
            System.out.println(" победу одержал: " + studentB);
        }
    }
}
