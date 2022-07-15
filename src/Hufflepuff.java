public class Hufflepuff extends  Hogwarts{
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String lastName, int magicPower, int teleportRange, int hardworking, int loyalty, int honesty) {
        super(firstName, lastName, magicPower, teleportRange);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void getBestHufflepuffStudent(Hufflepuff hufflepuff) {
        String studentA = hufflepuff.getFirstName() + " " + hufflepuff.getLastName();
        String studentB = this.getFirstName() + " " + this.getLastName();
        int pointsA = hufflepuff.getMagicPower() + hufflepuff.getTeleportRange() + points();
        int pointsB = this.getMagicPower() + this.getTeleportRange() + this.points();
        System.out.print("Между студентами: " + studentA + "(" + pointsA + ")" + " и " + studentB + "(" + pointsB + ")");
        if (pointsA > pointsB) {
            System.out.println(" победу одержал: " + studentA);
        } else {
            System.out.println(" победу одержал: " + studentB);
        }
    }
    private int points () {
        return honesty + loyalty + hardworking;
    }
}
