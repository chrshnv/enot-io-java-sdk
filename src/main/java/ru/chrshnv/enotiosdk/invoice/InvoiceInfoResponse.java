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

	public InvoiceInfoResponse() {
	}

	public UUID getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(UUID invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public InvoiceStatus getStatus() {
		return status;
	}

	public void setStatus(InvoiceStatus status) {
		this.status = status;
	}

	public Double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(Double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public Double getCredited() {
		return credited;
	}

	public void setCredited(Double credited) {
		this.credited = credited;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getPayService() {
		return payService;
	}

	public void setPayService(String payService) {
		this.payService = payService;
	}

	public String getPayerDetails() {
		return payerDetails;
	}

	public void setPayerDetails(String payerDetails) {
		this.payerDetails = payerDetails;
	}

	public Double getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public Double getCommissionPercent() {
		return commissionPercent;
	}

	public void setCommissionPercent(Double commissionPercent) {
		this.commissionPercent = commissionPercent;
	}

	public Double getShopCommissionAmount() {
		return shopCommissionAmount;
	}

	public void setShopCommissionAmount(Double shopCommissionAmount) {
		this.shopCommissionAmount = shopCommissionAmount;
	}

	public Double getUserCommissionAmount() {
		return userCommissionAmount;
	}

	public void setUserCommissionAmount(Double userCommissionAmount) {
		this.userCommissionAmount = userCommissionAmount;
	}

	public Double getUserCommissionPercent() {
		return userCommissionPercent;
	}

	public void setUserCommissionPercent(Double userCommissionPercent) {
		this.userCommissionPercent = userCommissionPercent;
	}

	public Map<String, Object> getCustomField() {
		return customField;
	}

	public void setCustomField(Map<String, Object> customField) {
		this.customField = customField;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getExpiredAt() {
		return expiredAt;
	}

	public void setExpiredAt(Date expiredAt) {
		this.expiredAt = expiredAt;
	}

	public Date getPaidAt() {
		return paidAt;
	}

	public void setPaidAt(Date paidAt) {
		this.paidAt = paidAt;
	}
}
