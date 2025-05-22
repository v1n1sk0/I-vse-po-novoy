public abstract class HogwartsStudent {
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
        int score1 = s1.magicPower + s1.transgressionDistance;
        int score2 = s2.magicPower + s2.transgressionDistance;

        System.out.println("Сравнение " + s1.name + " и " + s2.name + " по магическим способностям:");
        if (score1 > score2) {
            System.out.println(s1.name + " сильнее " + s2.name);
        } else if (score1 < score2) {
            System.out.println(s2.name + " сильнее " + s1.name);
        } else {
            System.out.println("Они равны.");
        }
    }
}
