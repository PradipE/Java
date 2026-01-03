
package genericclass;

interface printable {

    void print();
}

interface showable {

    void show();
}
//generic class with ultiple bound 

class MultiGeneric< G extends Number & printable & showable> {

    private G value;

    public void setValue(G value) {
        this.value = value;
    }

    public void getValue() {

        value.print();
        value.show();
         System.out.println("As double: " + value.doubleValue());
    }
     

}
public  class MultiBound extends Number implements printable, showable {

    public int val;

    //constructor 
    public MultiBound (int val) {
        this.val = val;
    }
      public void print() {
        System.out.println("Printing number: " + val);
    }

    // Implement showable
    @Override
    public void show() {
        System.out.println("Showing number: " + val);
    }
    
     public int intValue() {
        return val;
    }

    @Override
    public long longValue() {
        return val;
    }

    @Override
    public float floatValue() {
        return val;
    }

    @Override
    public double doubleValue() {
        return val;
    }
    

}
