# Logger System - Chain of Responsibility Design Pattern

This project demonstrates the implementation of a **Logger System** using the **Chain of Responsibility** design pattern in Java. The system processes log messages at different severity levels (`INFO`, `WARNING`, `ERROR`), passing the request along a chain of handlers that are responsible for handling specific log levels.

Here's the Blog:
[LLD - Design a Logger - Chain of Responsibility Design Pattern](https://manishpushkar.me/lld-design-a-logger-chain-of-responsibility-design-pattern)


## Design Pattern

This project implements the **Chain of Responsibility** design pattern, where:
- **LogHandler** is the abstract base class for all loggers.
- Each logger (e.g., `InfoLogHandler`, `WarningLogHandler`, `ErrorLogHandler`) handles a specific log level.
- If a logger can't handle the log request, it forwards the request to the next logger in the chain.

## Log Levels

The system processes three types of log messages, defined by the `LogLevel` enum:
- **INFO**: General information messages.
- **WARNING**: Messages that warn about potential issues.
- **ERROR**: Critical error messages that need immediate attention.


### Example Chain:
```text
Info -> Warning -> Error
