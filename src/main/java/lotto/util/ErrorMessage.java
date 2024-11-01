package lotto.util;

public enum ErrorMessage {
    INVALID_PURCHASE_AMOUNT_ERROR("올바른 금액을 입력해 주세요."),
    NUMBER_FORMAT_ERROR("입력값은 숫자여야 합니다."),
    NEGATIVE_OR_ZERO_AMOUNT_ERROR("금액은 0보다 커야 합니다."),
    NOT_THOUSAND_UNIT_ERROR("금액은 1,000원 단위로 입력해 주세요.");

    private static final String ERROR_PREFIX = "[ERROR] ";
    private static final String NEW_LINE = "\n";

    public final String message;

     ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR_PREFIX + message + NEW_LINE;
    }
}