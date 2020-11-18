package lesson5;

class Tunnel extends Stage {

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car car) {
        try {
            try {
                System.out.println(car.getName() + " готовится к этапу(ждет): " + description);

                MainClass.TUNNEL.acquire();

                System.out.println(car.getName() + " начал этап: " + description);
                Thread.sleep(length / car.getSpeed() * 1000);

                MainClass.TUNNEL.release();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(car.getName() + " закончил этап: " + description);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}