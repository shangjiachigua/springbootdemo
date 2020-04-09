package wen.tian.exception1;

import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tian
 * @version 1.0.0
 * @ClassName BaseException.java
 * @createTime 2020年04月09日 10:51
 **/
public abstract class BaseException extends RuntimeException {
    private final ErrorCode error;
    private final HashMap<String, Object> data = new HashMap<>();

    public BaseException(ErrorCode error, Map<String, Object> data) {
        super(error.getMessage());
        this.error = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    protected BaseException(ErrorCode error, Map<String, Object> data, Throwable cause) {
        super(error.getMessage(), cause);
        this.error = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    public ErrorCode getError() {
        return error;
    }

    public Map<String, Object> getData() {
        return data;
    }

}
