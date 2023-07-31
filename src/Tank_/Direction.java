package Tank_;

public enum Direction {
    UP("up"), DOWN("down"),LEFT("left"),RIGHT("right");
    private String dir;
    private Direction(String dir) {
        this.dir = dir;
    }
}
