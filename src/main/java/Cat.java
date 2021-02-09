public class Cat {
    private String name;
    private int appetit;
    //private int hungry;
    private boolean satiety;



    public Cat(String name, int appetit, /*int hungry,*/ boolean satiety) {
        this.name = name;
        this.appetit = appetit;
        //this.hungry = hungry;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    //public int getHungry() {
    //    return hungry;
    //}
//
    //public void setHungry(int hungry) {
    //    this.hungry = hungry;
    //}

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetit);
    }
}
