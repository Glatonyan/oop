package hogwarts;

public class Hufflepuff extends hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, powerOfMagic, transgressionDistance);
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

    @Override
    protected int sumOfCharacteristics() {
        return diligence + loyalty + honesty;
    }

    public void compareTo(Hufflepuff hufflepuff) {
        compareToStudents(hufflepuff);
    }

    @Override
    public String toString() {
        return super.toString() + ", трудолюбие: %d, верность: %d, честность: %d".formatted(diligence, loyalty, honesty);
    }
}