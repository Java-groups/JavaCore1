package AllHomeWorks.HomeWork3.Task1.Part3;

public enum HTTPError {
    BadRequest("400", "Bad Request"),
    Unauthorized("401", "Unauthorized"),
    PaymentRequired("402", "Payment Required"),
    Forbidden("403","Forbidden"),
    NotFound("404", "Not Found"),
    MethodNotAllowed("405", "Method Not Allowed"),
    NotAcceptable("406", "Not Acceptable"),
    ProxyAuthenticationRequired("407", "Proxy Authentication Required");

    private final String errorNum;
    private final String errorDisc;

    HTTPError (String errorNum, String errorDisc) {
        this.errorNum = errorNum;
        this.errorDisc = errorDisc;
    }

    public String getErrorDisc() {
        return errorDisc;
    }

    public String getErrorNum() {
        return errorNum;
    }
}

