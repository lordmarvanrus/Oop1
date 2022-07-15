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
    public void getBestGryffindorStudent(Gryffindor gryffindor) {
        String studentA = gryffindor.getFirstName() + " " + gryffindor.getLastName();
        String studentB = this.getFirstName() + " " + this.getLastName();
        int pointsA = gryffindor.getMagicPower() + gryffindor.getTeleportRange() + points();
        int pointsB = this.getMagicPower() + this.getTeleportRange() + this.points();
        System.out.print("Между студентами: " + studentA + "(" + pointsA + ")" + " и " + studentB + "(" + pointsB + ")");
        if (pointsA > pointsB) {
            System.out.println(" победу одержал: " + studentA);
        } else {
            System.out.println(" победу одержал: " + studentB);
        }
    }
    private int points () {
        return honesty + nobility + bravery;
    }
    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d ", super.toString(), nobility, honesty, bravery);
    }
}
