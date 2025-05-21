public class HogwartsStudent {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void printDescription() {
        System.out.println("Имя: " + name);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Дистанция трансгрессии: " + transgressionDistance);
    }

    public static void compareStudents(HogwartsStudent s1, HogwartsStudent s2) {
        int score1 = s1.getMagicPower() + s1.getTransgressionDistance();
        int score2 = s2.getMagicPower() + s2.getTransgressionDistance();

        System.out.println("Сравнение " + s1.getName() + " и " + s2.getName() + " по магии и трансгрессии:");
        if (score1 > score2) {
            System.out.println(s1.getName() + " лучше " + s2.getName());
        } else if (score1 < score2) {
            System.out.println(s2.getName() + " лучше " + s1.getName());
        } else {
            System.out.println("Они равны по магическим качествам.");
        }
    }
}
