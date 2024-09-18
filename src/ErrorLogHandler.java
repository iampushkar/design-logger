public class ErrorLogHandler extends LoggerHandler {

    ErrorLogHandler(LoggerHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(LogLevel level, String message) {
        if (level == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        }
    }
}
