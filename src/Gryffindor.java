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
    public static void getBestStudent(String lastNameA, String lastNameB ,Gryffindor[] gryffindors) {
        String studentA = null;
        String studentB = null;
        int pointsA = 0;
        int pointsB = 0;
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            if (lastNameA.equals(gryffindor.getLastName())) {
                studentA = gryffindor.getFirstName() + " " + gryffindor.getLastName();
                pointsA = gryffindor.getMagicPower() + gryffindor.getTeleportRange() + gryffindor.getBravery() +
                    gryffindor.getHonesty() + gryffindor.getNobility();
            }
            if (lastNameB.equals(gryffindor.getLastName())) {
                studentB = gryffindor.getFirstName() + " " + gryffindor.getLastName();
                pointsB = gryffindor.getMagicPower() + gryffindor.getTeleportRange() + gryffindor.getBravery() +
                        gryffindor.getHonesty() + gryffindor.getNobility();
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
