package model;

public enum Collector {
    MEAT_BOY("model/resources/character/blue_trash_king/g_idle/idle0001.png"),
    BLUE_TRASH_KING("model/resources/character/blue_trash_king/g_idle/idle0001.png"),
    TRASH_KING("model/resources/character/blue_trash_king/g_idle/idle0001.png");


    String urlCollector;

    public String getUrlCollector() {
        return urlCollector;
    }

    private Collector(String urlCollector) {
        this.urlCollector = urlCollector;
    }
}
