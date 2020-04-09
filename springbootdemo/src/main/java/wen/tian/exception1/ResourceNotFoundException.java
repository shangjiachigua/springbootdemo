package wen.tian.exception1;


import com.sun.javafx.collections.MappingChange;

import java.util.Map;

/**
 * @author tian
 * @version 1.0.0
 * @ClassName ResourceNotFoundException.java
 * @createTime 2020年04月09日 10:52
 **/
public class ResourceNotFoundException extends BaseException {
    public ResourceNotFoundException(Map<String, Object> data) {
        super(ErrorCode.RESOURCE_NOT_FOUND, data);
    }
}
