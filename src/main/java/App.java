import simulation.MultithreadedSimulation;

public class App {

    public static void main(String[] args)  {
        MultithreadedSimulation multithreadedSimulation = new MultithreadedSimulation();
        multithreadedSimulation.initialization();
        multithreadedSimulation.start();
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        multithreadedSimulation.stop();

    }
}