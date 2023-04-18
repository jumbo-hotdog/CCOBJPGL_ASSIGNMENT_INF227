public class exercise1 {
    
    static boolean iWillReview = true;
    static boolean iWillNotFail = false;

    public static void main(String[] args) throws Exception  {

        App myApp = new App();

        // precondition 
        assert iWillReview == true: "Tinamad ako.";

        myApp.Study();

        // postcondition 
        assert iWillNotFail == true: "Hindi kasi nagreview.";

}
        void Study() {

            iWillNotFail = false;
  }
}
