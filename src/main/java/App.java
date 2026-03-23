import simulation.MultithreadedSimulation;

public class App {

    public static void main(String[] args)  {
        MultithreadedSimulation multithreadedSimulation = new MultithreadedSimulation();
        System.out.println("Начало симуляции...");
        multithreadedSimulation.initialization();
        multithreadedSimulation.start();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        multithreadedSimulation.stop();
        System.out.println("Конец симуляции...");

    }
}