import hogwarts.Gryffindor;
import hogwarts.Hufflepuff;
import hogwarts.Ravenclaw;
import hogwarts.Slytherin;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Gryffindor harry = generateGryffindorStudent("Гарри Поттер");
        Gryffindor ron = generateGryffindorStudent("Рон Уизли");
        Gryffindor malfoy = generateGryffindorStudent("Дракс Малфой");

        harry.compareTo(ron);
        harry.compareToHogwartsStudents(malfoy);
        harry.print();

        ron.print();
        malfoy.print();
    }


    private static Gryffindor generateGryffindorStudent(String name) {
        return new Gryffindor(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static Hufflepuff generateHufflepuffStudent(String name) {
        return new Hufflepuff(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static Ravenclaw generateRavenclawStudent(String name) {
        return new Ravenclaw(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }


    private static Slytherin generateSlytherinStudent(String name) {
        return new Slytherin(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }
}