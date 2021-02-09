public class Main {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Люцифер", 150,false);
        cat[1] = new Cat("Барсик", 100,false);
        cat[2] = new Cat("Пизябра", 200,false);
        cat[3] = new Cat("Буся", 250, false);
        cat[4] = new Cat("Цезарь", 178, false);

        Plate plate = new Plate(200);
        plate.infoPlate();

        for (int i = 0; i < cat.length; i++) {
            if (cat[i].getAppetit() > plate.getFood() ){
                plate.refillThePlate();
            }
            if (cat[i].isSatiety() == false && cat[i].getAppetit() < plate.getFood()) {
                cat[i].eat(plate);
                cat[i].setSatiety(true);
                System.out.println("Кот " + cat[i].getName() + " съел " + cat[i].getAppetit() + " граммов корма " + cat[i].isSatiety());
            }

        }


    }


}





