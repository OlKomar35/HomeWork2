package com.komar;

/**
 * Данный класс - это тарелка с едой
 *
 * @author Komar Olga
 */
public class Plate {
    /**
     * Количество еды в тарелке
     */
    private int food;
    /**
     * Максимально количество еды, которое помещается в тарелку
     */
    private final int MAX_PLATE = 300;
    /**
     * Одна порция еды, которую можно добавить в тарелку за один раз
     */
    private final int NORM_FOOD = 30;

    /**
     * @param food Количество еды, которое влазит в тарелку. Данный параметр должен быть положительным
     */
    public Plate(int food) {
        checkFood(food);
    }


    /**
     * Конструктор - создание нового объекта
     *
     * @see Plate#Plate(int)
     */
    public Plate() {
        this(300);
    }

    /**
     * Функция получения значения поля {@link Plate#food}
     *
     * @return возвращает количество еды в тарелке
     */
    public int getFood() {
        return food;
    }

    /**
     * Меняет количество еды в тарелки
     *
     * @param food не может быть отрицательным
     */
    public void setFood(int food) {
        checkFood(food);
    }

    /**
     * Выводит информацию о нашей тарелке
     */
    public void info() {
        System.out.println("plate: " + food);
    }

    private void checkFood(int food) {
        if (food >= 0) {
            this.food = food;
        } else {
            throw new RuntimeException("Что-то пошло не так!!!");
        }
    }

    public void additive() {
        if (food < MAX_PLATE) {
            food += NORM_FOOD;
        }
    }
}
