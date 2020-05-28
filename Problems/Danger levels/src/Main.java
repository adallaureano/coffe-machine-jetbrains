enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int number;

    DangerLevel(int number) {
        this.number = number;
    }

    public int getLevel() {
        return number;
    }
}

