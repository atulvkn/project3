package in.co.rays.proj3.exception;
/**
 * DuplicateRecordException thrown when a duplicate record occurred
 *
 * @author Atul Bharti
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class DuplicateRecordException extends Exception {

    /**
     * @param msg
     * error message
     */
    public DuplicateRecordException(String msg) {
        super(msg);
    }

}