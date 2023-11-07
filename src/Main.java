
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory("Honda Motor", "Dostoevskogo 3");
        Honda honda = new Honda(2019,Color.CHERRY,3.0, factory,300);
        System.out.println(honda.getAllInfo());
        honda.makeSignal();
        honda.makeSignal("Beep Beep");
        honda.engineRunning(honda);

        Factory factory1 = new Factory("Honda Motors", "Gorkogo 25");
        PilotHonda pilotHonda = new PilotHonda(2018, Color.DARKBLUE, 2.5, factory1, 450,
                "ADC2430");
        System.out.println(pilotHonda.getInfo());
        pilotHonda.engineRunning(pilotHonda);

        Factory factory2 = new Factory("Acura", "Pushkina 39");
        PilotHonda pilotHonda1 = new PilotHonda(2017,Color.WHITE,3.5,factory2, 280,
                "IOS1407");
        System.out.println(pilotHonda1.getInfo());
        pilotHonda1.engineRunning(pilotHonda1);

    }
}