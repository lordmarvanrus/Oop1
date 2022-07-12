import java.util.Random;

public class Hogwarts {
    private String firstName;
    private String lastName;
    private int magicPower;
    private int teleportRange;

    public Hogwarts(String firstName, String lastName, int magicPower, int teleportRange) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.magicPower = magicPower;
        this.teleportRange = teleportRange;
    }
    public static int getRandomNumber () {
        int max = 100;
        Random i = new Random();
        return i.nextInt(max);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTeleportRange() {
        return teleportRange;
    }

    public void setTeleportRange(int teleportRange) {
        this.teleportRange = teleportRange;
    }

    public static void getBestStudent(String lastNameA, String lastNameB, Hogwarts [] students) {
        String studentA = null;
        String studentB = null;
        int pointsA = 0;
        int pointsB = 0;
        for (int i = 0; i < students.length; i++) {
            Hogwarts hogwarts = students[i];
            if (lastNameA.equals(hogwarts.getLastName())) {
                studentA = hogwarts.getFirstName() + " " + hogwarts.getLastName();
                pointsA = hogwarts.getMagicPower() + hogwarts.getTeleportRange();
            }
            if (lastNameB.equals(hogwarts.getLastName())) {
                studentB = hogwarts.getFirstName() + " " + hogwarts.getLastName();
                pointsB = hogwarts.getMagicPower() + hogwarts.getTeleportRange();
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
