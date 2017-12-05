package quoters;

public class TerminatorQuoter implements Quoter {

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    private String messsage;

    public void sayQuote() {

        System.out.println("messsage = " + messsage);
    }
}
