public class exercise1 {
    
    static boolean iWillReview = false;
    static boolean iWillNotFail = false;

    public static void main(String[] args) throws Exception  {

        App myApp = new App();

        // precondition 
        assert iWillReview == true: "Reviewing..";

        myApp.Study();

        // postcondition 
        assert iWillNotFail == true: "Passed!";

        System.out.println(iWillReview);
        System.out.println(iWillNotFail);

}
        void Study() {

            iWillReview = false;
            iWillNotFail = false;
  }
}
