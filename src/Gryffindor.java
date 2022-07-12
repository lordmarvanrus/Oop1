import java.util.Random;

public class Gryffindor extends Hogwarts{
    private int bravery;
    private int honesty;
    private int nobility;

    public Gryffindor(String firstName, String lastName, int magicPower, int teleportRange, int bravery, int honesty, int nobility) {
        super(firstName, lastName, magicPower, teleportRange);
        this.bravery = bravery;
        this.honesty = honesty;
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public static void getBestStudent(Gryffindor[] gryffindors) {
        String bestStudent = null;
        int points;
        int bestPoints = 0;
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            points = gryffindor.getMagicPower() + gryffindor.getTeleportRange() + gryffindor.getBravery() +
                    gryffindor.getHonesty() + gryffindor.getNobility();
            if (points > bestPoints) {
                bestPoints = points;
                bestStudent = gryffindor.getFirstName() + " " + gryffindor.getLastName();
            }
            points = 0;
        }
        System.out.println("Самый сильный студент Гриффиндора: " + bestStudent);
    }
}
