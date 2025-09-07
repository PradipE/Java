package genericclass;

public class Main {

    public static void main(String[] args) {
        // List<Integer> wildCartIntListsrc = new ArrayList<>();
        // List<Float> wildCartIntListsdes = new ArrayList<>();
        // WildCart wildObj = new WildCart();
        // wildObj.computeList(wildCartIntListsrc, wildCartIntListsrc);
         
        TypeErasure<Integer> tObj = new TypeErasure<>();
        tObj.setVal(23);
        System.out.println(tObj.getVal());
    }
}
