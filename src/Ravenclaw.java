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

    public static void getBestStudent(Ravenclaw[] ravenclaws) {
        String bestStudent = null;
        int points;
        int bestPoints = 0;
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            points = ravenclaw.getMagicPower() + ravenclaw.getTeleportRange() + ravenclaw.getCreativity() +
                    ravenclaw.getIntelligence() + ravenclaw.getWisdom() + ravenclaw.getWit();
            if (points > bestPoints) {
                bestPoints = points;
                bestStudent = ravenclaw.getFirstName() + " " + ravenclaw.getLastName();
            }
            points = 0;
        }
        System.out.println("Самый сильный студент Когдеврана: " + bestStudent);
    }
}
