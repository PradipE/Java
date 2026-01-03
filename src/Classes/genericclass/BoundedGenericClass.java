package genericclass;

public class BoundedGenericClass<B extends Nummber>{
    
    //upper bound
    private B val;

    public B getPrintValue() {
      return this.value;
   }

   public void setPrintValue(B val) {
      this.val = val;
   }
   public int setInt()
   {
      return val;
   }

    
}
