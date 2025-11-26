package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();
        
        // Erste Iteration
        // output(queen.doYourJob());
        // output(queen.fly());
        // output("-------------------");
        // output(worker.doYourJob());
        // output(worker.fly());
        // output("-------------------");
        // output(drone.doYourJob());
        // output(drone.fly());
        // output("-------------------");


        pollObject(queen);
        pollObject(worker);
        pollObject(drone);
        
    }

    //  Zweite Iteration überladene Methoden
    // private static void pollObject(Queen obj){
    //     output(obj.doYourJob());
    //     output(obj.fly());
    //     output("-------------------");
    // }
    // private static void pollObject(Worker obj){
    //     output(obj.doYourJob());
    //     output(obj.fly());
    //     output("-------------------");
    // }
    // private static void pollObject(Drone obj){
    //     output(obj.doYourJob());
    //     output(obj.fly());
    //     output("-------------------");
    // }


    // Dritte Iteration Polymorphie
    private static void pollObject(HoneyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-------------------");
    }

   
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

