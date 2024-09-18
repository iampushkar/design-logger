public class InfoLogHandler extends LoggerHandler {

    InfoLogHandler(LoggerHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(LogLevel level, String message) {
        if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level, message);
        }
    }
}
