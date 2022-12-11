package arthurmkrtchian.javaCore.conditionStatements.homeWorks.homeWork1;

public enum HTTPError {
    BAD_REQUEST("400"),
    UNAUTHORIZED("401"),
    PAYMENT_REQUIRED("402"),
    FORBIDDEN("403"),
    NOT_FOUND("404"),
    METHOD_NOT_ALLOWED("405");

    private String errorCode;


    HTTPError(String s) {
        this.errorCode = s;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorName() {
        String error = "";
        switch (errorCode.toString()) {
            case "400":
                error = getErrorCode() + ": Bad request";
                break;
            case "401":
                error = getErrorCode() + ": Unauthorized";
                break;
            case "402":
                error = getErrorCode() + ": Payment required";
                break;
            case "403":
                error = getErrorCode() + ": Forbidden";
                break;
            case "404":
                error = getErrorCode() + ": Not found";
                break;
            case "405":
                error = getErrorCode() + ": Method not allowed";
                break;
        }
        return error;
    }
}
