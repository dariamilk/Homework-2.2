public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;
    public Hufflepuff (String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super (name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
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
    public String toString () {
        return "Имя: " + super.getName() + ". Мощность магии: " + super.getMagicPower() + ". Расстояние трансгресии: "
                + super.getTransgressionDistance() + ". Трудолюбие: " + diligence + ". Верность: " + loyalty
                + ". Честность: " + honesty + ".";
    }
    public void compareStudents (Hufflepuff student) {
        int sumOfPoints = diligence + loyalty + honesty;
        int studentSumOfPoints = student.diligence + student.loyalty + student.honesty;
        if (sumOfPoints > studentSumOfPoints) {
            System.out.println(super.getName() + " лучший Пуффендуец, чем " + student.getName() + ".");
        } else if (studentSumOfPoints > sumOfPoints) {
            System.out.println(student.getName() + " лучший Пуффендуец, чем " + super.getName() + ".");
        } else {
            System.out.println(student.getName() + " и " + super.getName() + " одинаково хорошие Пуффендуйцы!");
        }
    }
}
