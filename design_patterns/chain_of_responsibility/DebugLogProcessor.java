package chain_of_responsibility;

public class DebugLogProcessor extends LogProcessor {
    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG LOG : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
