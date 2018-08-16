package alex.mrrok.domain.entity;

import java.util.Objects;

public class ErrorNet extends Exception {

    private ErrorType errorType;
    private String message;

    public ErrorNet(String message, ErrorType errorType) {
        super(message);
        this.errorType = errorType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorNet errorNet = (ErrorNet) o;
        return errorType == errorNet.errorType &&
                Objects.equals(message, errorNet.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorType, message);
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
