package chain_of_responsibility;

import java.util.Objects;

abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String message) {
        if (!Objects.isNull(nextLogProcessor)) {
            nextLogProcessor.log(logLevel, message);
        }
    }
}
