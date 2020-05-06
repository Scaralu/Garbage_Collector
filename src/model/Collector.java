package model;

public enum Collector {
    PINK_TRASH_KING("src/model/resources/character/trash_king/g_idle/idle0005.png"),
    TRASH_KING("src/model/resources/character/trash_king/g_idle/idle0001.png");


    String urlCollector;

    public String getUrlCollector() {
        return urlCollector;
    }

    private Collector(String urlCollector) {
        this.urlCollector = urlCollector;
    }
}
