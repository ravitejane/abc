package ins.util;

public class ResponseModel {
	private String status;
	private int statusCode;
	private Object data;
	public ResponseModel(String status, int statusCode, Object data) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public ResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
