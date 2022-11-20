package java8.home;

import java8.announcement.Announcement;

public class Home extends Announcement {
    private String homeType;
    private int maxGuests;

    public Home(String name, String image, double price, String description, String homeType, int maxGuests) {
        super(name, image, price, description);
        this.homeType = homeType;
        this.maxGuests = maxGuests;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }

    @Override
    public String toString() {
        return "Home{" +
                super.toString()+
                "homeType='" + homeType + '\'' +
                ", maxGuests=" + maxGuests +
                '}';
    }
}
