package genericclass;

public  class PairGenericClass<S,I> {
    //this is how we create pair value of generic class
        private S data;
        private I key;

        public void set(S data, I key) {
            this.data = data;
            this.key = key;
        }

        public I getKey() {
            return key;
        }
        public S getValue()
        {
            return data;
        }

}
