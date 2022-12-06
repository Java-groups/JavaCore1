public enum HTTPErrors {
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    PAYMENT_REQUIRED(402),
    FORBIDDEN(403),
    NOT_FOUND(404);
    private final int code;

    HTTPErrors(int code) {
        this.code = code;
    }
}

