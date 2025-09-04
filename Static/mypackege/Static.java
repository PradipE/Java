package mypackege;

 public class  Static {

    int leg = 10;
    static int head = 30;

    public static int penTotalPrice() {
        int penBody = 10;
        int penAll = 22;
        head = 33;
        // you caan't access a non-static instance in a static method leg=20;
        int totalPrice = penAll + penBody;
        System.out.println(totalPrice);
        Static obj1 = new Static();
        int ans = obj1.printHead();
        return totalPrice;

    }

    public int printHead() {
        leg = 30;
        head = 22;
        int ans = leg + head;
        System.out.println("total is :" + ans);

        return ans;
    }
}


