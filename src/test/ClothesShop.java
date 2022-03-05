package test;

interface Clothes {

    public void show();

}

class Dress implements Clothes {

    public void show() {
        System.out.println("物品：白色连衣裙 \n价格:100元");
    }
}

class Pants implements Clothes {

    public void show() {
        System.out.println("物品：蓝色长裤\n价格:60元");
    }
}

class Shop {

    private Clothes commodity;

    public void setCommodity(Clothes commodity) {
        this.commodity = commodity;
    }

    public Clothes getCommodity() {
        return commodity;
    }

    public void show() {
        commodity.show();
    }
}

public class ClothesShop {

    public static void main(String[] args) {

        Shop s = new Shop();
        Clothes c = new Dress();
        s.setCommodity(c);
        c.show();
        c = new Pants();
        s.setCommodity(c);
        s.show();
    }

}
