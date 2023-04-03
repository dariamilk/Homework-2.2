public class Slytherin extends Hogwarts {
    private int ruse;
    private int determination;
    private int ambitiousness;
    private int smartness;
    private int hungerForPower;
    public Slytherin (String name, int magicPower, int transgressionDistance, int ruse, int determination,
                      int ambitiousness, int smartness, int hungerForPower) {
        super (name, magicPower, transgressionDistance);
        this.ruse = ruse;
        this.determination = determination;
        this.ambitiousness= ambitiousness;
        this.smartness = smartness;
        this.hungerForPower = hungerForPower;
    }

    public int getRuse() {
        return ruse;
    }

    public void setRuse(int ruse) {
        this.ruse = ruse;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public int getHungerForPower() {
        return hungerForPower;
    }

    public void setHungerForPower(int hungerForPower) {
        this.hungerForPower = hungerForPower;
    }
    public String toString () {
        return "Имя: " + super.getName() + ". Мощность магии: " + super.getMagicPower() + ". Расстояние трансгресии: "
                + super.getTransgressionDistance() + ". Хитрость: " + ruse + ". Решительность: " + determination
                + ". Амбициозность: " + ambitiousness + ". Находчивость: " + smartness + ". Жажда власти: "
                + hungerForPower + ".";
    }
    public void compareStudents (Slytherin student) {
        int sumOfPoints = super.getMagicPower() + super.getTransgressionDistance() + ruse + determination + ambitiousness + smartness + hungerForPower;
        int studentSumOfPoints = student.getMagicPower() + student.getTransgressionDistance() + student.ruse + student.determination + student.ambitiousness + student.smartness + student.hungerForPower;
        if (sumOfPoints > studentSumOfPoints) {
            System.out.println(super.getName() + " лучший Слизеринец, чем " + student.getName() + ".");
        } else if (studentSumOfPoints > sumOfPoints) {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + super.getName() + ".");
        } else {
            System.out.println(student.getName() + " и " + super.getName() + " одинаково хорошие Слизеринцы!");
        }
    }
}
