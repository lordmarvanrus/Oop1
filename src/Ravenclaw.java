public class Ravenclaw extends Hogwarts{
private int intelligence;
private int wisdom;
private int wit;
private int creativity;

    public Ravenclaw(String firstName, String lastName, int magicPower, int teleportRange, int intelligence, int wisdom, int wit, int creativity) {
        super(firstName, lastName, magicPower, teleportRange);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public static void getBestStudent(String lastNameA, String lastNameB ,Ravenclaw[] ravenclaws) {
        String studentA = null;
        String studentB = null;
        int pointsA = 0;
        int pointsB = 0;
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            if (lastNameA.equals(ravenclaw.getLastName())) {
                studentA = ravenclaw.getFirstName() + " " + ravenclaw.getLastName();
                pointsA = ravenclaw.getMagicPower() + ravenclaw.getTeleportRange() + ravenclaw.getCreativity() +
                        ravenclaw.getIntelligence() + ravenclaw.getWisdom() + ravenclaw.getWit();
            }
            if (lastNameB.equals(ravenclaw.getLastName())) {
                studentB = ravenclaw.getFirstName() + " " + ravenclaw.getLastName();
                pointsB = ravenclaw.getMagicPower() + ravenclaw.getTeleportRange() + ravenclaw.getCreativity() +
                        ravenclaw.getIntelligence() + ravenclaw.getWisdom() + ravenclaw.getWit();
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
