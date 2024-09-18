abstract class LoggerHandler {

    protected LoggerHandler nextHandler;

    LoggerHandler(LoggerHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(LogLevel level, String message);
}