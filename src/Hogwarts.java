public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;
    public Hogwarts (String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
    public String getName () {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
    public void comparePerBasicAbilities (Hogwarts student) {
        if (magicPower > student.magicPower) {
            System.out.println(name + " обладает большей силой магии, чем " + student.name + ". ");
        } else {
            System.out.println(student.name + " обладает большей силой магии, чем " + name + ". ");
        }
        if (transgressionDistance > student.transgressionDistance) {
            System.out.println(name + " обладает большим расстоянием трансгрессии, чем " + student.name + ". ");
        } else {
            System.out.println(student.name + " обладает большим расстоянием трансгрессии, чем " + name + ". ");
        }
    }
    public void printStudent () {
        System.out.println(this);
    }
}
