public class PrintService {
    public static void print(Gryffindor[] gryffindors) {
        System.out.println("Размер списка студентов Гриффиндора: " + gryffindors.length);
        System.out.println();
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя: " + gryffindor.getFirstName() + " " + gryffindor.getLastName());
            System.out.println("Магическая сила: " + gryffindor.getMagicPower());
            System.out.println("Дальность трансгрессии: " + gryffindor.getTeleportRange() + " км");
            System.out.println("Благородство: " + gryffindor.getNobility());
            System.out.println("Честь: " + gryffindor.getHonesty());
            System.out.println("Храбрость: " + gryffindor.getBravery());
            System.out.println();
        }
    }

    public static void print(Slytherin[] slytherins) {
        System.out.println("Размер списка студентов Слизерина " + slytherins.length);
        System.out.println();
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя: " + slytherin.getFirstName() + " " + slytherin.getLastName());
            System.out.println("Магическая сила: " + slytherin.getMagicPower());
            System.out.println("Дальность трансгрессии: " + slytherin.getTeleportRange() + " км");
            System.out.println("Хитрость: " + slytherin.getTrickery());
            System.out.println("Решительность: " + slytherin.getResolve());
            System.out.println("Амбициозность: " + slytherin.getAmbition());
            System.out.println("Находчивость: " + slytherin.getResourcefulness());
            System.out.println("Жажда власти: " + slytherin.getAuthorityHunger());
            System.out.println();
        }
    }

    public static void print(Hufflepuff[] hufllepuffs) {
        System.out.println("Размер списка студентов Пуффендуя: " + hufllepuffs.length);
        System.out.println();
        for (int i = 0; i < hufllepuffs.length; i++) {
            Hufflepuff hufflepuff = hufllepuffs[i];
            System.out.println("Имя: " + hufflepuff.getFirstName() + " " + hufflepuff.getLastName());
            System.out.println("Магическая сила: " + hufflepuff.getMagicPower());
            System.out.println("Дальность трансгрессии: " + hufflepuff.getTeleportRange() + " км");
            System.out.println("Трудолюбие: " + hufflepuff.getHardworking());
            System.out.println("Верность: " + hufflepuff.getLoyalty());
            System.out.println("Честность: " + hufflepuff.getHonesty());
            System.out.println();
        }
    }

    public static void print(Ravenclaw[] ravenclaws) {
        System.out.println("Размер списка студентов Когтеврана: " + ravenclaws.length);
        System.out.println();
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя: " + ravenclaw.getFirstName() + " " + ravenclaw.getLastName());
            System.out.println("Магическая сила: " + ravenclaw.getMagicPower());
            System.out.println("Дальность трансгрессии: " + ravenclaw.getTeleportRange() + " км");
            System.out.println("Интеллект: " + ravenclaw.getIntelligence());
            System.out.println("Мудрость: " + ravenclaw.getWisdom());
            System.out.println("Остроумие: " + ravenclaw.getWit());
            System.out.println("Творческие навые: " + ravenclaw.getCreativity());
            System.out.println();
        }
    }
}
