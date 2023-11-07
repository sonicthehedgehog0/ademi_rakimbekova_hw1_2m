public final class PilotHonda extends Honda{
    private String lisencePlate;

    public String getLisencePlate() {
        return lisencePlate;
    }
    public PilotHonda(int year, Color color, double volume, Factory factory,
                      int razbeg, String lisencePlate){
        super(year, color, volume,factory, razbeg);
        this.lisencePlate = lisencePlate;

    }
    @Override
    public void engineRunning(Honda a){
        System.out.println("Hondas engine is running.");
    }
    @Override
    public String getInfo(){
        return super.getInfo() +
                "\nLISENCE_PLATE: " + lisencePlate;
    }
    @Override
    public String getAllInfo(){
        return super.getAllInfo();
    }
}
