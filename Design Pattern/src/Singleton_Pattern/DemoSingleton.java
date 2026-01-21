package Singleton_Pattern;

import Singleton_Pattern.Singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        System.out.println("--- Bắt đầu Test Singleton ---");

        // Tạo Thread 1: Cố gắng khởi tạo với data "KHÓA HỌC JAVA"
        Thread threadJava = new Thread(() -> {
            Singleton s1 = Singleton.getInstance("KHÓA HỌC JAVA");
            System.out.println("Thread Java: " + s1.getData());
        });

        // Tạo Thread 2: Cố gắng khởi tạo với data "KHÓA HỌC DESIGN PATTERN"
        Thread threadDesignPattern = new Thread(() -> {
            Singleton s2 = Singleton.getInstance("KHÓA HỌC DESIGN PATTERN");
            System.out.println("Thread Design Pattern: " + s2.getData());
        });

        threadJava.start();
        threadDesignPattern.start();

        // Chờ các thread chạy xong để kiểm tra kết quả cuối cùng
        try {
            threadJava.join();
            threadDesignPattern.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Kiểm tra xem 2 instance thực tế có là 1 không
        Singleton finalCheck1 = Singleton.getInstance("DỮ LIỆU MỚI");
        Singleton finalCheck2 = Singleton.getInstance("DỮ LIỆU MỚI HƠN");

        System.out.println("\nKết quả sau cùng:");
        System.out.println("Data của instance: " + finalCheck1.getData());
        System.out.println("Hai biến có cùng trỏ vào 1 vùng nhớ? " + (finalCheck1 == finalCheck2));
    }
}