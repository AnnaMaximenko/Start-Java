package Sem6Homework;

// import java.util.List;

public class Laptop {

    private String deviseName;
    private String manufacturer;// производитель

    private int randomAccessMemory;// оперативная память
    private int HHD;// объем жесткого диска
    private String operatingSystem;
    private String color;
    private String screenType;// тип экрана

    private int rating;// рейтинг
    private String availability;// наличие в магазинах
    private int price;// цена

    public Laptop(String deviseName, String manufacturer, int randomAccessMemory, int hHD, String operatingSystem,
            String color, String screenType, int rating, String availability, int price) {
        this.deviseName = deviseName;
        this.manufacturer = manufacturer;
        this.randomAccessMemory = randomAccessMemory;
        HHD = hHD;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.screenType = screenType;
        this.rating = rating;
        this.availability = availability;
        this.price = price;
    }

    public String getDeviseName() {
        return deviseName;
    }

    public void setDeviseName(String deviseName) {
        this.deviseName = deviseName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(int randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public int getHHD() {
        return HHD;
    }

    public void setHHD(int hHD) {
        HHD = hHD;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop [deviseName=" + deviseName + ", manufacturer=" + manufacturer + ", randomAccessMemory="
                + randomAccessMemory + ", HHD=" + HHD + ", operatingSystem=" + operatingSystem + ", color=" + color
                + ", screenType=" + screenType + ", rating=" + rating + ", availability=" + availability + ", price="
                + price + "]";
    }

}