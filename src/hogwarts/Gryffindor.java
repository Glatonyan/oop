package hogwarts;

public class Gryffindor extends hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    protected int sumOfCharacteristics() {
        return nobility + honor + bravery;
    }

    public void compareTo(Gryffindor gryffindor) {
        compareToStudents(gryffindor);
    }

    @Override
    public String toString() {
        return super.toString() + ", благородство: %d, честь: %d, храбрость: %d".formatted(nobility, honor, bravery);
    }
}