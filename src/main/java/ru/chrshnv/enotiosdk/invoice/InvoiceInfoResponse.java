package ru.chrshnv.enotiosdk.invoice;

import com.google.gson.annotations.SerializedName;
import ru.chrshnv.enotiosdk.other.Currency;
import ru.chrshnv.enotiosdk.other.InvoiceStatus;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

public class InvoiceInfoResponse {
	@SerializedName("invoice_id")
	private UUID invoiceId;

	@SerializedName("order_id")
	private String orderId;

	@SerializedName("shop_id")
	private String shopId;

	private InvoiceStatus status;

	@SerializedName("invoice_amount")
	private Double invoiceAmount;

	private Double credited;

	private Currency currency;

	@SerializedName("pay_service")
	private String payService;

	@SerializedName("payer_details")
	private String payerDetails;

	@SerializedName("commission_amount")
	private Double commissionAmount;

	@SerializedName("commission_percent")
	private Double commissionPercent;

	@SerializedName("shop_commission_amount")
	private Double shopCommissionAmount;

	@SerializedName("user_commission_amount")
	private Double userCommissionAmount;

	@SerializedName("user_commission_percent")
	private Double userCommissionPercent;

	@SerializedName("custom_field")
	private Map<String, Object> customField;

	@SerializedName("created_at")
	private Date createdAt;

	@SerializedName("expired_at")
	private Date expiredAt;

	@SerializedName("paid_at")
	private Date paidAt;
}
