class Child extends Parent {
    static void show() {  // not overriding, but hiding
        System.out.println("Child static method");
    }
}