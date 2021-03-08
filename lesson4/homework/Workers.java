package lesson4.homework;

public class Workers {
        private String fio;
        private String position;
        private String phoneNumber;
        private double pay;
        private int age;
        static int id = 1;
// * 2 Конструктор класса должен заполнять эти поля при создании объекта;
    Workers(String fio, String position, String phoneNumber, double pay, int age){
        this.fio = fio;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.pay = pay;
        this.age = age;
// * 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    }
    public String getFio (){
        return fio;
    }
    public String getPosition (){
        return position;
    }
    public String getPhoneNumber (){
        return phoneNumber;
    }
    public double getPay (){
        return pay;
    }
    public int getAge (){
        return age;
    }
    // * 4 Вывести при помощи методов из пункта 3 ФИО и должность.
    // 7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер. (Не совсем верно исполнено, потому как не уникальный,
    // а лишь порядковый номер получился)
    public void id (){
        System.out.println("# "+ id++ + " ФИО: " + fio + ", должность: " + position);
    }
    public void info (){
        System.out.println("ФИО: " + fio + ", должность: " + position + ", телефон: " + phoneNumber + ", зарплата: " + pay + ",возраст: " + age);
    }
    // 6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
    public void donate () {
        System.out.println("ФИО: " + fio + ", должность: " + position + ", телефон: " + phoneNumber + ", повышенная зарплата на 10000: " + (pay + 10000) + ",возраст: " + age);
    }
}

