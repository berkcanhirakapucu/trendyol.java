package ibmtal.trendyol.core.result;

import java.util.ArrayList;

public class Result<T> {
     private Boolean success;
     private ArrayList<ResultItem> errors;
     private ArrayList<T> data;
	public Result() {
		super();
		this.success = true;
		this.errors = new ArrayList<ResultItem>();
		this.data = new ArrayList<T>();		
	}
	public Result(boolean success, ArrayList<ResultItem> errors, ArrayList<T> data) {
		super();
		this.success = success;
		this.errors = errors;
		this.data = data;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public ArrayList<ResultItem> getErrors() {
		return errors;
	}
	public void setErrors(ArrayList<ResultItem> errors) {
		this.errors = errors;
	}
	public ArrayList<T> getData() {
		return data;
	}
	public void setData(ArrayList<T> data) {
		this.data = data;
	
	}
}
