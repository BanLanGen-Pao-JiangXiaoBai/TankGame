package Tank_;

public enum Camp {
    Bad("bad"), Good("good");
    private String type;
    Camp(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
