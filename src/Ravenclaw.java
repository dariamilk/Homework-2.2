public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int esprit;
    private int creativity;
    public Ravenclaw (String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int esprit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.esprit = esprit;
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

    public int getCreativity() {
        return creativity;
    }
    public int getEsprit() {
        return esprit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public String toString () {
        return "Имя: " + super.getName() + ". Мощность магии: " + super.getMagicPower() + ". Расстояние трансгресии: "
                + super.getTransgressionDistance() + ". Ум: " + intelligence + ". Мудрость: " + wisdom + ". Остроумие: "
                + esprit + ". Творческие способности: " + creativity + ". ";
    }
    public void compareStudents (Ravenclaw student) {
        int sumOfPoints = super.getMagicPower() + super.getTransgressionDistance() + intelligence + wisdom + esprit + creativity;
        int studentSumOfPoints = student.getMagicPower() + student.getTransgressionDistance() + student.intelligence + student.wisdom + student.esprit + student.creativity;
        if (sumOfPoints > studentSumOfPoints) {
            System.out.println(super.getName() + " лучший Когтевранец, чем " + student.getName() + ".");
        } else if (studentSumOfPoints > sumOfPoints) {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + super.getName() + ".");
        } else {
            System.out.println(student.getName() + " и " + super.getName() + " одинаково хорошие Когтевранцы!");
        }
    }
}
