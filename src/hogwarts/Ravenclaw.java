package hogwarts;

public class Ravenclaw extends hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
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

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    protected int sumOfCharacteristics() {
        return intelligence + wisdom + wit + creativity;
    }

    public void compareTo(Ravenclaw ravenclaw) {
        compareToStudents(ravenclaw);
    }

    @Override
    public String toString() {
        return super.toString() + ", ум: %d, мудрость: %d, остроумие: %d, творчество: %d"
                .formatted(intelligence, wisdom, wit, creativity);
    }
}