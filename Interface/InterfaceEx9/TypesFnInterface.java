
@FunctionalInterface
interface Consumer<C> {

    void accept(C consume);

}
//supplier: (so, here no input but therre is return somthing)

@FunctionalInterface
interface Supplier<S> {

    S get();
}
// function: its accepts one arguments parameter and it produce the result so means it accept also and it return also

@FunctionalInterface
interface Function<F, G> {

    F apply(G val);
}

//predicats it accpt but alwayts return boolean 
@FunctionalInterface
interface Predicate<P> {

    boolean get(P val);
}

public class TypesFnInterface {

    public static void main(String[] args) {
        //consumer 
        // Consumer<Integer> checkLog =(Integer val)->{
        //     if(val >10)
        //     {
        //         System.out.println("Logged in");
        //     }
        // };
        // checkLog.accept(12);

        //supplier 
        // Supplier<String> isNum =()->{
        //     return "THis is Number ";
        // };
        // System.out.println(isNum.get());
        //Function
        // Function<String,Integer> intToStr =(Integer val)->{
        //       String output = val.toString();
        //       return output;
        // };
        //  System.out.println(intToStr.apply(34));
        //predicats
        Predicate<Integer> checkEven = (Integer val) -> {
            if (val % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(checkEven.get((21)));

    }
}
