public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 75, 67, 81, 89, 83);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 86, 80, 73, 80, 71);
        Gryffindor ronaldWeasley = new Gryffindor("Рон Уизли", 70, 65, 78, 80, 75);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 80, 80, 89, 76, 85, 80, 90);
        Slytherin grahamMontague = new Slytherin("Грехэм Монтегю", 69, 60, 89, 70, 79, 60, 89);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 65, 54, 60, 63, 74, 59, 84);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 79, 84, 81, 85, 90);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 83, 85, 89, 80, 91);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 78, 80, 86, 89, 81);
        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 76, 81, 85, 75, 74, 86);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 84, 78, 83, 79, 70, 72);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 73, 79, 74, 65, 90, 87);

        hermioneGranger.printStudent();
        hermioneGranger.compareStudents(harryPotter);
        zachariasSmith.compareStudents(justinFinchFletchley);
        padmaPatil.compareStudents(marcusBelby);
        dracoMalfoy.compareStudents(gregoryGoyle);
        harryPotter.comparePerBasicAbilities(marcusBelby);
    }
}