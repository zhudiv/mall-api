package ltd.newbee.mall.result;


import ltd.newbee.mall.result.exception.ResultStatus;

public class test<T> {
    /** 业务错误码 */
    private Integer code;
    /** 信息描述 */
    private String message;
    private T data;

    private test(ResultStatus resultStatus, T data) {
        this.code = resultStatus.getCode();
        this.message = resultStatus.getMessage();
        this.data = data;
    }
    public static String hello(){
        return "hello";
    }


    public static Result<Void> success() {
        return new test<Void>(ResultStatus.SUCCESS, null);
    }
}
