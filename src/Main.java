public class Main {
    private static Gryffindor gryffindorStudent(String firstName, String lastName) {
        return new Gryffindor(
                firstName,
                lastName,
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber()
        );
    }
    private static Slytherin slytherinStudent(String firstName, String lastName) {
        return new Slytherin(
                firstName,
                lastName,
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber()
        );
    }private static Hufflepuff hufflepuffStudent(String firstName, String lastName) {
        return new Hufflepuff(
                firstName,
                lastName,
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber()
        );
    }private static Ravenclaw ravenclawStudent(String firstName, String lastName) {
        return new Ravenclaw(
                firstName,
                lastName,
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber(),
                Hogwarts.getRandomNumber()
        );
    }
    public static void main(String[] args) {
                Gryffindor harry = gryffindorStudent("Гарри", "Поттер");
                Gryffindor hermione = gryffindorStudent("Гермиона", "Грейнджер");
                Gryffindor ron = gryffindorStudent("Рон", "Уизли");
                Slytherin draco = slytherinStudent("Драко", "Малфой");
                Slytherin graham = slytherinStudent("Грэхэм", "Монтегрю");
                Slytherin gregory = slytherinStudent("Грегори", "Гоил");
                Hufflepuff zechariah = hufflepuffStudent("Захария", "Смит");
                Hufflepuff cedric = hufflepuffStudent("Седрик", "Диггори");
                Hufflepuff justin = hufflepuffStudent("Джастин", "Финч-Флетчли");
                Ravenclaw zhou = ravenclawStudent("Чжоу", "Чанг");
                Ravenclaw padma = ravenclawStudent("Падма", "Патил");
                Ravenclaw marcus = ravenclawStudent("Маркус", "Белби");
                harry.print();
                harry.getBestStudent(draco);
                harry.getBestGryffindorStudent(ron);
                draco.getBestSlytherinStudent(graham);
                cedric.getBestHufflepuffStudent(justin);
                zhou.getBestRavenclawStudent(marcus);

    }
}
