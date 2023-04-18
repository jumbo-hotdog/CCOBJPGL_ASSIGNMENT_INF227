public class exercise1 {
    
    static boolean iWillReview = false;
    static boolean iWillNotFail = false;

    public static void main(String[] args) throws Exception  {

        App myApp = new App();

        // precondition 
        assert iWillReview == true: "Tinamad ako.";

        myApp.Study();

        // postcondition 
        assert iWillNotFail == true: "Hindi kasi nagreview.";

        System.out.println(iWillReview);
        System.out.println(iWillNotFail);

}
        void Study() {

            iWillReview = false;
            iWillNotFail = false;
  }
}
