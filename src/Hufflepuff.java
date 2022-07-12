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

    public static void getBestStudent(Hufflepuff[] hufflepuffs) {
        String bestStudent = null;
        int points;
        int bestPoints = 0;
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            points = hufflepuff.getMagicPower() + hufflepuff.getTeleportRange() + hufflepuff.getHardworking() +
                    hufflepuff.getHonesty() + hufflepuff.getLoyalty();
            if (points > bestPoints) {
                bestPoints = points;
                bestStudent = hufflepuff.getFirstName() + " " + hufflepuff.getLastName();
            }
            points = 0;
        }
        System.out.println("Самый сильный студент Пуффендуя: " + bestStudent);
    }
}
