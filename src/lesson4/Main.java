package lesson4;

public class Main {
    final Object m = new Object();
    volatile char currentLetter = 'A';
    public static void main(String[] args) {
        Main mn = new Main();

        new Thread(() -> mn.printLetter('A', 'B', 5)).start();
        new Thread(() -> mn.printLetter('B', 'C', 5)).start();
        new Thread(() -> mn.printLetter('C', 'A', 5)).start();

    }
    void printLetter(char mainLetter, char nextLetter, int count) {
        synchronized (m) {
            try {
                for (int i = 0; i < count; i++) {
                    while (currentLetter != mainLetter)
                        m.wait();
                    System.out.print(mainLetter);
                    currentLetter = nextLetter;
                    m.notifyAll();
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
