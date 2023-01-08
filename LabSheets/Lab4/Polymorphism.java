package LabSheets.Lab4;

class Car{
    public void run(){
        System.out.println("Running from Car");
    }
}

class BMW extends Car{
    
    public void run(){
        System.out.println("Running from BMW Car");
    }
}

public class Polymorphism {
    public static void main(String[] args){
        Car car = new Car();
        Car car2 = new BMW();
        BMW bmw = new BMW();
        //Bmw bmw2 = new Car()   -- not possible
        
        car.run();
        car2.run();
        bmw.run();

    }
}
