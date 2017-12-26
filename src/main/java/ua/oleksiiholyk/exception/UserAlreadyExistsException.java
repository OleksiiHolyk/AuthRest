package ua.oleksiiholyk.exception;


/**
 * Created by Oleksii on 26.12.2017.
 */
public class UserAlreadyExistsException extends Exception {

    private String errCode;
    private String errMsg;

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public UserAlreadyExistsException(String errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }


}
