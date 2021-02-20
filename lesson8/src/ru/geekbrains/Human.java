package ru.geekbrains;

public class Human {
    private String name;
    private int distanceRun;
    private int jump;

    public Human(String name, int distanceRun, int jump) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.jump = jump;
    }

    public void Running(String name, int distanceRun, int jumpHigh) {
        Treadmill.Running(name, distanceRun);
        Wall.Jumping(name, jumpHigh);
    }
}
