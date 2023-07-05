package ru.chrshnv.enotiosdk.other;

import com.google.gson.annotations.SerializedName;

public class Response<T> {
	private T data;
	private String error;
	private Integer status;

	@SerializedName("status_check")
	private Boolean statusCheck;

	public Response() {
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Boolean getStatusCheck() {
		return statusCheck;
	}

	public void setStatusCheck(Boolean statusCheck) {
		this.statusCheck = statusCheck;
	}
}
