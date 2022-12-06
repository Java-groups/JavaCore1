import static java.lang.System.out;

public class Search {
    public void codeValue(int code) {
        switch (code) {
            case 400:
                out.println("Meaning: " + HTTPErrors.BAD_REQUEST);
                break;
            case 401:
                out.println("Meaning: " + HTTPErrors.UNAUTHORIZED);
                break;
            case 402:
                out.println("Meaning: " + HTTPErrors.PAYMENT_REQUIRED);
                break;
            case 403:
                out.println("Meaning: " + HTTPErrors.FORBIDDEN);
                break;
            case 404:
                out.println("Meaning: " + HTTPErrors.NOT_FOUND);
                break;
            default:
                out.println("Code not found");

        }
    }
}
