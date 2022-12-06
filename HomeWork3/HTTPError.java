package edu.homeworks.homework3;

public enum HTTPError {
    Bad_Request ("400"),
    Unauthorized("401"),
    PaymentRequired("402"),
    Forbidden("403"),
    NotFound("404");

    private String title;

    HTTPError(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
