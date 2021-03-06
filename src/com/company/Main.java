package com.company;
import java.util.Scanner;
enum TrafficLight {
    //Declare constants of enum type
    RED(100), // values are in seconds
    GREEN(120),
    YELLOW(35);
    private final int duration;
    private TrafficLight(int duration) {
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Цвета светофоров и их длительность: ");
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%-10s%-5d%-5s\n", light, light.getDuration(), " секунд");
        }
    }
}
