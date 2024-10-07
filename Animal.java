public abstract class Animal {
    private String type;
    private boolean walk;
    private boolean swim;

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
    public void setWalk() {
        this.walk = true;
    }

    public void setSwim() {
        this.swim = true;
    }

    public boolean getWalk() {
        return this.walk;
    }
    public boolean getSwim() {
        return this.swim;
    }
}
