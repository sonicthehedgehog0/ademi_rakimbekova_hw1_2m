public class Car {

    private int year;
    private Color color;
    private double volume;
    private Factory factory;

    public int getYear() {
        return year;
    }

    public Color getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }

    public Factory getFactory() {
        return factory;
    }

    public Car(int year, Color color, double volume, Factory factory) {
        this.year = year;
        this.color = color;
        this.volume = volume;
        this.factory = factory;
    }

    public Car (int year, Color color) {
        this.year = year;
        this.color = color;
    }
public String getAllInfo(){
        return "YEAR: " + year +
                "\nCOLOR: " + color +
                "\nVOLUME: " + volume +
                "\nFACTORY_NAME: " + factory.getName() +
                "\nFACTORY_STREET: " + factory.getStreet();
}
public String getInfo(){
        return "YEAR: " + year +
                "\nCOLOR: " + color;
}
}
