package multithreading;

class MultiThreadThing extends Thread{

    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
// We can either extend the thread class or implement the runnable interface 
// both of them do the same thing

class MultiThreadThing2 implements Runnable{

    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    
}

public class MultiThreadingBasics {
    public static void main(String[] args){
        MultiThreadThing myThing = new MultiThreadThing();
        MultiThreadThing2 myThing2 = new MultiThreadThing2();
       
        Thread thread = new Thread(myThing2);
        thread.setName("Runnable Method Thread");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("First Thread Completed and Joined");
        //We can use the run method here but that won't cause this to branch off and run separately as a new thread
        // If we use run here first it executes sequentially not in async mode
        myThing.setName("Extends Thread method thread");
        myThing.start();

    }
}
