package chain_of_responsibility;

public class Test {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "Exception occurred ");
        logObject.log(LogProcessor.DEBUG, "Need to debug this ");
        logObject.log(LogProcessor.INFO, "Just for info ");

    }
}
