package Dzien9.Task11;

public class Email {
    private String receiver;
    private String title;
    private String bodyMsg;
    private String attachment;

    private class Builder{
        Email email = new Email();
    }
}
