package lesson4.homework;
public class LessonFour {

    public static void main (String[] args) {
// * 5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        Workers[] workers = new Workers[5];
        workers[0] = new Workers("Maria", "Broker","777",150000.3,40);
        workers[1] = new Workers("Maksim", "Engineer","123",120000.7,18);
        workers[2] = new Workers("Nikolay", "Psychologist","222",100000.1,30);
        workers[3] = new Workers("Sergey", "Artist","100",80000,41);
        workers[4] = new Workers("Helena", "Cashier","555",50000,35);
//        Workers worker1 = new Workers("Maria", "Broker","777",150000,40);
//        Workers worker2 = new Workers("Maksim", "Engineer","123",120000,35);
//        Workers worker3 = new Workers("Nikolay", "Psychologist","222",100000,30);
//        Workers worker4 = new Workers("Sergey", "Artist","100",80000,20);
//        Workers worker5 = new Workers("Helena", "Cashier","555",50000,25);
// * 4 Вывести при помощи методов из пункта 3 ФИО и должность.
        System.out.println("Все сотрудники:");
        for (int i = 0; i < workers.length; i++) {
                workers[i].id();
        }
        System.out.println("\nСотрудники старше 40 лет:");
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge()>=40)
            workers[i].info();
        }
        System.out.println("\nСотрудники старше 35 лет зарплата на 10000 больше:");
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge()>=35)
                workers[i].donate();
        }
    }
}
