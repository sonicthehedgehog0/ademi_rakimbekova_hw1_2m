public class Honda extends Car{
    private int razbeg;

    public int getRazbeg() {
        return razbeg;
    }

    public Honda(int year, Color color, double volume, Factory factory, int razbeg) {
        super(year, color, volume, factory);
        this.razbeg = razbeg;
    }
    public Honda(int year, Color color, int razbeg){
        super(year, color);
        this.razbeg = razbeg;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nRAZBEG: " + razbeg;
    }

    public void makeSignal(){
        System.out.println("Vroom Vroom");
    }

    public void makeSignal(String Signal){
        System.out.println(Signal);
    }
    public final void engineRunning(Car a){
        System.out.println("Cars engine is running.");
    }
    public void engineRunning(Honda a){
        System.out.println("Hondas engine is running.");
    }
    public String getAllInfo(){
        return super.getAllInfo();
    }
}
