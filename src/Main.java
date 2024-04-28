public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний;");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать».");
        }
        System.out.println("Задание 2");
        int temperature = -10;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задание 3");
        int speed = 70;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч можно ездить спокойно");
        }
        System.out.println("Звадание 4");
        int age1 = 30;
        if (age1 >= 2 && age1 < 6) {
            System.out.println("Если возраст человека равен " + age1 + " лет, то ему нужно ходить в детский сад.");
        }
        if (age1 >= 7 && age1 < 17) {
            System.out.println("Если возраст человека равен " + age1 + " лет, то ему нужно ходить в школу.");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Если возраст человека равен " + age1 + " лет, то ему нужно ходить в университет.");
        }
            if (age1 >= 24) {
            System.out.println("Если возраст человека равен " + age1 + " лет, то ему пора ходить на работу.");
        }
        System.out.println("Звадание 5");
        int age2 = 15;
        if (age2 <= 5) {
            System.out.println("Если возраст ребёнка равен " + age2 + " лет, то он не может кататься на аттракционе.");
        }
        if (age2 > 5 && age2 < 14) {
            System.out.println("Если возраст ребёнка равен " + age2 + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age2 >= 14) {
            System.out.println("Если возраст ребёнка равен " + age2 + " лет, то он может кататься без сопровождения взрослого.");
        }
        System.out.println("Задание 6");
        int places = 103;
        if (places < 60) {
            System.out.println("Если в вагоне " + places + " человека, то в вагоне есть сидячие и стоячии места");
        }
        if (places >= 60 && places < 102) {
            System.out.println(" Если в вагоне " + places + " человека, то в вагоне есть только стоячии места");
        } else {
            System.out.println(" Если в вагоне " + places + " человека, то вагон уже полностью забит.");
        }
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("one");
        } else if (two > three) {
            System.out.println("two");
        } else {
            System.out.println("Three");
        }

    }
}