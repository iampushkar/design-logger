class LoggerSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Logger System");

        LoggerHandler logger = new InfoLogHandler(new WarningLogHandler(new ErrorLogHandler(null)));

        logger.handleRequest(LogLevel.INFO, "This is an info message");
        logger.handleRequest(LogLevel.WARNING, "This is an warning message");
        logger.handleRequest(LogLevel.ERROR, "This is an error message");
        
    }
}