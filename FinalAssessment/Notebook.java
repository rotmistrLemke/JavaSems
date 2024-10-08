package FinalAssessment;

public class Notebook {
    private String name;
    private int hddVolume;
    private int ramVolume;
    private String osName;
    private String color;

    public Notebook(String name, int hddVolume, int ramVolume, String osName, String color) {
        this.name = name;
        this.hddVolume = hddVolume;
        this.ramVolume = ramVolume;
        this.osName = osName;
        this.color = color;
    }

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getHddVolume() { return hddVolume; }
    public void setHddVolume(int hddVolume) { this.hddVolume = hddVolume; }
    public int getRamVolume() { return ramVolume; }
    public void setRamVolume(int ramVolume) { this.ramVolume = ramVolume; }
    public String getOsName() { return osName; }
    public void setOsName(String osName) { this.osName = osName; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return "Ноутбук{" +
                "название='" + name + '\'' +
                ", объемЖД=" + hddVolume +
                ", объемОЗУ=" + ramVolume +
                ", операционнаяСистема='" + osName + '\'' +
                ", цвет='" + color + '\'' +
                '}';
    }
}
