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

    public static void getBestStudent(String lastNameA, String lastNameB ,Hufflepuff[] hufflepuffs) {
        String studentA = null;
        String studentB = null;
        int pointsA = 0;
        int pointsB = 0;
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            if (lastNameA.equals(hufflepuff.getLastName())) {
                studentA = hufflepuff.getFirstName() + " " + hufflepuff.getLastName();
                pointsA = hufflepuff.getMagicPower() + hufflepuff.getTeleportRange() + hufflepuff.getHardworking() +
                        hufflepuff.getHonesty() + hufflepuff.getLoyalty();
            }
            if (lastNameB.equals(hufflepuff.getLastName())) {
                studentB = hufflepuff.getFirstName() + " " + hufflepuff.getLastName();
                pointsB = hufflepuff.getMagicPower() + hufflepuff.getTeleportRange() + hufflepuff.getHardworking() +
                        hufflepuff.getHonesty() + hufflepuff.getLoyalty();
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
