package dio.springbootweb.handler;

public class BusinessException extends RuntimeException {

    public BusinessException(String message, Object ... params) {
        super(String.format(message, params));
    }

    public BusinessException(String message) {
        super(message);
    }
    
}
