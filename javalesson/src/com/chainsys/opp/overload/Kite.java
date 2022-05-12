package com.chainsys.opp.overload;

public class Kite {
    void fly(int distance)
    {
        System.out.println("Fly "+distance);
    }
    void fly(double time,int speed)
    {
        System.out.println("Fly "+time);
    }
    int fly(int time,int speed)
    {
        return time*speed;
    }
    void fall(String time)
    {
        System.out.println("Fall"+time);
    }
    int fall(int distance)
    {
        System.out.println("Fall2 "+distance);
        return distance;
    }
    void glide(int time)
    {
        System.out.println("Glide "+time);
    }
    void glide(double time)
    {
        System.out.println("Glide 2 "+time);
    }

}
