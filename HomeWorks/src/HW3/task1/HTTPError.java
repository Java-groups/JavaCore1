package HW3.task1;
	
public enum HTTPError {
	BAD_REQUEST(400),
    UNAUTHORIZED(401),
    PAYMENT_REQUIRED(402),
    FORBIDDEN(403),
    NOT_FOUND(404),
	METHOD_NOT_ALLOWED(405),
	NOT_ACCEPTABLE(406),
	PROXY_AUTHENTICATION_REQUIRED(407),
	REQUEST_TIMEOUT(408),
	CONFLICT(409),
	GONE(410),
	LENGTH_REQUIRED(411);

	private Integer errorNumber;

	
	private HTTPError(Integer errNum) {
		this.errorNumber = errNum;
	}
    
	public static void main(String[] args) {
		for (HTTPError httper : HTTPError.values())
			System.out.println(httper + " " + httper.errorNumber);
	}
	
}
   
