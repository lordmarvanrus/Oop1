public class Main {
    public static void main (String[] args) {
        Hogwarts [] students = {
                new Hogwarts("Гарри", "Поттер", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hogwarts("Гермиона", "Грейнджер", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hogwarts("Рон", "Уизли", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hogwarts("Драко", "Малфой", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hogwarts("Грэхэм", "Монтегрю", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hogwarts("Грегори", "Гоил", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hogwarts("Захария", "Смит", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hogwarts("Седрик", "Диггори", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hogwarts("Джастин", "Финч-Флетчли", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hogwarts("Чжоу", "Чанг", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hogwarts("Падма", "Патил", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hogwarts("Маркус", "Белби", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber())
        };
        Gryffindor [] gryffindors = {
                new Gryffindor("Гарри", "Поттер", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Gryffindor("Гермиона", "Грейнджер", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Gryffindor("Рон", "Уизли", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber())
        };
        Slytherin [] slytherins = {
                new Slytherin("Драко", "Малфой", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Slytherin("Грэхэм", "Монтегрю", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Slytherin("Грегори", "Гоил", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber())
        };
        Hufflepuff [] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hufflepuff("Седрик", "Диггори", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Hufflepuff("Джастин", "Финч-Флетчли", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber())
        };
        Ravenclaw [] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Ravenclaw("Падма", "Патил", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber()),
                new Ravenclaw("Маркус", "Белби", Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(),
                        Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber(), Hogwarts.getRandomNumber())
        };
        PrintService.print(gryffindors);
        Gryffindor.getBestStudent(gryffindors);
        Slytherin.getBestStudent(slytherins);
        Hufflepuff.getBestStudent(hufflepuffs);
        Ravenclaw.getBestStudent(ravenclaws);



    }
}
