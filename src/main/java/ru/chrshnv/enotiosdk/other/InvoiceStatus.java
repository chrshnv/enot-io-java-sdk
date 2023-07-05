package ru.chrshnv.enotiosdk.other;

import com.google.gson.annotations.SerializedName;

public enum InvoiceStatus {
	@SerializedName("created")
	CREATED,

	@SerializedName("success")
	SUCCESS,

	@SerializedName("fail")
	FAIL,

	@SerializedName("expired")
	EXPIRED
}
