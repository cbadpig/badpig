package code.com.badpig.util;

/**
 * 方法返回值的封装类
 */
public class Result {

    /**
     * 返回成功
     */
    private static final boolean SUCCESS = true;

    /**
     * 返回失败
     */
    private static final boolean ERROR = false;

    /**
     * 返回状态，正确或错误
     */
    public boolean flag;

    /**
     * 返回码，0：无意义；大于0：返回成功码；小于0：返回失败码
     */
    private int code = 0;

    /**
     * 返回信息
     */
    private Object message;

    public int getCode() {
        return code;
    }

    public Object getMessage() {
        return message;
    }

    public static Result OK() {
        Result result = new Result();
        result.flag = SUCCESS;
        result.code = 1;
        return result;
    }

    public static Result OK(Object message) {
        Result result = new Result();
        result.flag = SUCCESS;
        result.code = 1;
        result.message = message;
        return result;
    }

    public static Result OK(int code,Object message) {
        Result result = new Result();
        result.flag = SUCCESS;
        result.code = code;
        result.message = message;
        return result;
    }

    public static Result ERROR() {
        Result result = new Result();
        result.flag = ERROR;
        result.code = -1;
        return result;
    }

    public static Result ERROR(Object message) {
        Result result = new Result();
        result.flag = ERROR;
        result.code = -1;
        result.message = message;
        return result;
    }

    public static Result ERROR(int code,Object message) {
        Result result = new Result();
        result.flag = ERROR;
        result.code = code;
        result.message = message;
        return result;
    }
}
