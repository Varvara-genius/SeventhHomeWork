public class Plate {
    private int food;


    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }


    public void refillThePlate() {
        this.food += 200;
        System.out.println("После добавления корма в тарелке стало " + food + " грамм корма");
    }


    public void infoPlate() {
        System.out.println("Тарелка заполнена на: " + food + " грамм корма");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }


}

