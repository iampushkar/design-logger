public class WarningLogHandler extends LoggerHandler {

    WarningLogHandler(LoggerHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(LogLevel level, String message) {
        if (level == LogLevel.WARNING) {
            System.out.println("WARNING: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level, message);
        }
    }
    
}
