package com.komar;


public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 5),
                new Cat("Мурзик", 6),
                new Cat("Масик", 4),
                new Cat("Катька", 2),
                new Cat(),
                new Cat("Буся", 5),
                new Cat("Машка", 8),
                new Cat("Булочка", 15),
                new Cat("Гарфилд", 1),
                new Cat("Айза", 9),
                new Cat("Гром", 6),
        };

        Plate plate = new Plate(28);

        plate.info();

        /**
         * Данны метод будет наполнять тарелку и кормить котов до тех пор, пока все коты не будут сыты
         */
        boolean flag = false;
        while (!flag) {
            int i = 0;
            while (i < cats.length && plate.getFood() > 0) {
                if (!cats[i].isSatiety() && plate.getFood() >= cats[i].getAppetite()) {
                    cats[i].eat(plate);
                }
                i++;
            }

            for (Cat cat : cats) {
                if (cat.isSatiety()) {
                    System.out.printf("Cat: %s - сыт\n", cat.getName());
                } else {
                    System.out.printf("Cat: %s - голоден\n", cat.getName());
                    flag = true;
                }
            }
            plate.info();

            if (flag) {
                System.out.println("\nОстались голодные котики, положили добавку!\n");
                plate.additive();
                flag = false;
            } else {
                System.out.println("\nВсе котики сыты\n");
                flag = true;
            }
            plate.info();
        }

    }
}
