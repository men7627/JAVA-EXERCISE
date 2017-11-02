class UnsupportedFunctionException extends RuntimeException {
	final int ERR_CODE;
	
	UnsupportedFunctionException(String msg,int errCode){
		super(msg);
		this.ERR_CODE = errCode;
	}

	public int getErrCode() {
		return ERR_CODE;
	}
	public String getMessage() {
		return "["+getErrCode()+"]"+super.getMessage();
	}
}

public class EXERCISE_8_9 {

	public static void main(String[] args) {
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.",100);
	}

}
