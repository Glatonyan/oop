package hogwarts;

public abstract class hogwarts {


    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    private int sumOfBaseCharacteristics() {
        return powerOfMagic + transgressionDistance;
    }

    protected abstract int sumOfCharacteristics();

    protected void compareToStudents(hogwarts hogwarts) {
        int sumOfCharacteristics1 = this.sumOfBaseCharacteristics();
        int sumOfCharacteristics2 = hogwarts.sumOfBaseCharacteristics();
        if (sumOfCharacteristics1 > sumOfCharacteristics2) {
            System.out.printf(
                    "студент %s лучше студента %s (%d vs %d)%n",
                    this.getName(),
                    hogwarts.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else if (sumOfCharacteristics1 < sumOfCharacteristics2) {
            System.out.printf(
                    "студент %s лучше студента %s (%d vs %d)%n",
                    hogwarts.getName(),
                    this.getName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        } else {
            System.out.printf(
                    "студент %s и %s одинаковые (%d vs %d)%n",
                    hogwarts.getName(),
                    this.getName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        }
    }

    public void compareToHogwartsStudents(hogwarts hogwarts) {
        int sumOfCharacteristics1 = this.sumOfBaseCharacteristics();
        int sumOfCharacteristics2 = hogwarts.sumOfBaseCharacteristics();
        if (sumOfCharacteristics1 > sumOfCharacteristics2) {
            System.out.printf(
                    "студент %s лучше студента %s (%d vs %d)%n",
                    this.getName(),
                    hogwarts.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else if (sumOfCharacteristics1 < sumOfCharacteristics2) {
            System.out.printf(
                    "студент %s лучше студента %s (%d vs %d)%n",
                    hogwarts.getName(),
                    this.getName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        } else {
            System.out.printf(
                    "студент %s и %s одинаковые (%d vs %d)%n",
                    hogwarts.getName(),
                    this.getName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        }
    }

    @Override
    public String toString() {
        return "%s, сила магии: %d, сила трансгрессии: %d".formatted(name, powerOfMagic, transgressionDistance);
    }

    public void print() {
        System.out.println(this);
    }
}
