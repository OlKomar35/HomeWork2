package com.komar;

/**
 * Данный класс описывает голодных и сытых котиков
 *
 * @author Komar Olga
 */

public class Cat {

    /**
     * Имя кота
     */
    private String name;
    /**
     * Аппетит кота
     */
    private int appetite;

    /**
     * Поле сытости
     */
    private boolean satiety;

    /**
     * Создаем ГОЛОДНОГО котика
     *
     * @param name     Имя кота
     * @param appetite Аппетит кота - это количество единиц еды которые нужны для наступления сытости
     */
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    /**
     * Создание БЕЗДОМНОГО и ГОЛОДНОГО кота.
     * Накормить такого кота практически не возможно
     *
     * @see Cat#Cat(String, int)
     */
    public Cat() {
        this("Бездомный кот", 200);
    }

    /**
     * Функция получения значения поля {@link Cat#name}
     *
     * @return Возвращает имя котика
     */
    public String getName() {
        return name;
    }

    /**
     * Функция получения значения поля {@link Cat#appetite}
     *
     * @return Возвращает количество еды, которое котик может скушать
     */
    public int getAppetite() {
        return appetite;
    }


    /**
     * Функция получения значения поля {@link Cat#satiety}
     *
     * @return Возвращает статус сытости кота
     */
    public boolean isSatiety() {
        return satiety;
    }

    /**
     * Метод, который заставляет кота покушать
     */
    public void eat(Plate plate) {
        plate.setFood(plate.getFood() - appetite);
        satiety = true;
    }

}
