package genericclass;

public class RawGenericClass<G>{
    private G value ;


    public G getValue()
    {
        return value;
    }
    public void setValue(G value)
    {
       this.value =value;
    }
}
