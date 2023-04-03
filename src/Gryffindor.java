public class Gryffindor extends Hogwarts {
    private int nobleness;
    private int honor;
    private int courage;
    public Gryffindor (String name, int magicPower, int transgressionDistance, int nobleness, int honor, int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.courage = courage;
    }
    public int getCourage() {
        return courage;
    }
    public int getNobleness() {
        return nobleness;
    }
    public int getHonor (){
        return honor;
    }
    public void setCourage (int courage) {
        this.courage = courage;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }
    public String toString () {
        return "Имя: " + super.getName() + ". Мощность магии: " + super.getMagicPower() + ". Расстояние трансгресии: "
                + super.getTransgressionDistance() + ". Благородство: " + nobleness + ". Честь: " + honor
                + ". Храбрость: " + courage + ".";
    }
    public void compareStudents (Gryffindor student) {
        int sumOfPoints = super.getMagicPower() + super.getTransgressionDistance() + nobleness + honor + courage;
        int studentSumOfPoints = student.getMagicPower() + student.getTransgressionDistance() + student.nobleness + student.courage + student.honor;
        if (sumOfPoints > studentSumOfPoints) {
            System.out.println(super.getName() + " лучший Гриффендорец, чем " + student.getName() + ".");
        } else if (studentSumOfPoints > sumOfPoints) {
            System.out.println(student.getName() + " лучший Гриффендорец, чем " + super.getName() + ".");
        } else {
            System.out.println(student.getName() + " и " + super.getName() + " одинаково хорошие Гриффиндорцы!");
        }
    }
}
