import java8.announcement.Announcement;
import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Airplane;
import java8.transport.Car;
import java8.transport.Helicopter;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int price = input.nextInt();

        Phone phone1 = new Phone("Iphone","\uD83D\uDE0E",147000,"Amazing phone","14 PRO Max",256);
        Phone phone2 = new Phone("Samsung","\uD83E\uDD29",58000,"Great phone","S21",128);
        Phone[] phones = {phone1,phone2};

        Laptop laptop1 = new Laptop("MacBook", "\uD83D\uDE0D",129000,"Wonderful laptop","Mac OS");
        Laptop laptop2 = new Laptop("Acer", "\uD83E\uDD16",176000,"Productive laptop","Windows");
        Laptop[] laptops = {laptop1,laptop2};

        Home home1 = new Home("Ihlas","\uD83C\uDFE2",3500000,"Great Home","Multi-storey",10);
        Home home2 = new Home("Chaos","\uD83C\uDFE0",15000000,"Amazing Home","House",25);
        Home[] homes = {home1,home2};

        Car car1 = new Car("Mercedes-Benz","\uD83D\uDE98",15000000,"Wonderful Car","Black", LocalDate.of(2010,3,6));
        Car car2 = new Car("BMW","\uD83D\uDE99",12000000,"Fast Car","Purple", LocalDate.of(2020,8,28));
        Car[] cars = {car1,car2};

        Airplane airplane1 = new Airplane("Supermarine Spitfire","\uD83D\uDEE9",125000000,"Fast Airplane","White", LocalDate.of(2015,1,14));
        Airplane airplane2 = new Airplane("Airbus A320","✈️",23000000,"Large Airplane","Blue", LocalDate.of(2004,11,16));
        Airplane[] airplanes = {airplane1,airplane2};

        Helicopter helicopter1 = new Helicopter("MD 500 Defender","\uD83D\uDE81",13500000,"Fast Helicopter","Brown",LocalDate.of(2012,12,23));
        Helicopter helicopter2 = new Helicopter("Boeing AH-64 Apache","\uD83D\uDE81",115000000,"Large Helicopter","Red",LocalDate.of(1999,7,9));
        Helicopter[] helicopters = {helicopter1,helicopter2};

        Announcement[] announcements = {phone1,phone2, laptop1,laptop2,home1,home2, car1, car2, airplane1,airplane2,helicopter1,helicopter2};

        //findByPrice(price, phones, laptops, homes, cars, airplanes, helicopters);
        //findByPrice(price, announcements);

        getExpensivePhone(phones);
        getMac(laptops);
        getAmazingHome(homes);
        getCheaper(cars);
        System.out.println(getWhite(airplanes));

    }
    public static void findByPrice(double price, Phone[] phones, Laptop[] laptops, Home[] homes, Car[] cars, Airplane[] airplanes, Helicopter[] helicopters){
        for (Phone phone : phones) {
            if (phone.getPrice() == price){
                System.out.println(phone);
            }
        }
        for (Laptop laptop : laptops) {
            if (laptop.getPrice()==price){
                System.out.println(laptop);
            }
        }
        for (Home home : homes) {
            if (home.getPrice()==price){
                System.out.println(home);
            }
        }
        for (Car car : cars) {
            if (car.getPrice()==price){
                System.out.println(car);
            }
        }
        for (Airplane airplane : airplanes) {
            if (airplane.getPrice()==price){
                System.out.println(airplane);
            }
        }
        for (Helicopter helicopter : helicopters) {
            if (helicopter.getPrice()==price){
                System.out.println(helicopter);
            }
        }
    }
    public static void findByPrice(double price, Announcement[] announcements){
        for (Announcement announcement:announcements) {
            if (price == announcement.getPrice()){
                System.out.println(announcement);
            }
        }
    }public static void getExpensivePhone(Phone[] phones){
        double a = 0;
        for (Phone phone:phones) {
            a = Math.max(a, phone.getPrice());
        }
        System.out.println("The price of expensive phone " + a);
    }
    public static void getMac(Laptop[] laptops){
        for (Laptop laptop: laptops) {
            if (laptop.getOperationSystem().contains("Mac")){
                System.out.println("The mac" + laptop.getOperationSystem());
            }
        }
    }
    public static void getAmazingHome(Home[] homes){
        for (Home home:homes) {
            if (home.getDescription().contains("Amazing")){
                System.out.println("amazing home is " + home.getName());
            }
        }
    }public static void getCheaper(Car[] cars){
        double a = 0;
        if (cars[0].getPrice() > cars[1].getPrice()){
            System.out.println(cars[1].getPrice());
        }else {
            System.out.println(cars[0].getPrice());
        }
    }
    public static String getWhite(Airplane[] airplanes){
        String a = null;
        for (Airplane airplane:airplanes) {
            if (airplane.getColour().equals("White")){
                a = airplane.getName();
            }
        }
        return a;
    }
}