package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иванов Иван Иванович","конструктор", "inavov@gmail.ru", "+79999999999", 25000, 45);


        Person[] persArray = new Person[5];
        persArray[0] = new Person("Петров Иван Иванович","инженер", "petrov@gmail.ru", "+79999999998", 30000, 40);
        persArray[1] = new Person("Сидоров Иван Иванович","руководитель", "sidorov@gmail.ru", "+79999999997", 35000, 41);
        persArray[2] = new Person("Кольцов Иван Иванович","водитель", "koltsov@gmail.ru", "+79999999996", 40000, 42);
        persArray[3] = new Person("Попов Иван Иванович","строитель", "popov@gmail.ru", "+79999999995", 45000, 43);
        persArray[4] = new Person("Сивов Иван Иванович","менеджер", "sivov@gmail.ru", "+79999999994", 50000, 44);

        Park.Carousel carousel = new Park().new Carousel();
    }

}
















