package ru.chrshnv.enotiosdk.invoice;

import com.google.gson.annotations.SerializedName;
import ru.chrshnv.enotiosdk.other.Currency;

import java.net.URI;
import java.util.List;
import java.util.UUID;

public class InvoiceRequest {
	private Double amount;

	@SerializedName("order_id")
	private String orderId;

	private Currency currency;

	@SerializedName("shop_id")
	private UUID shopId;

	@SerializedName("hook_url")
	private String hookUrl;

	@SerializedName("custom_fields")
	private String customFields;

	private String comment;

	@SerializedName("fail_url")
	private URI failUrl;

	@SerializedName("success_url")
	private URI successUrl;

	private Integer expire;

	@SerializedName("include_service")
	private List<String> includeService;

	@SerializedName("exclude_service")
	private List<String> excludeService;

	public static InvoiceRequestBuilder builder() {
		return new InvoiceRequestBuilder();
	}

	public InvoiceRequest(Double amount, String orderId, Currency currency, UUID shopId, String hookUrl, String customFields, String comment, URI failUrl, URI successUrl, Integer expire, List<String> includeService, List<String> excludeService) {
		this.amount = amount;
		this.orderId = orderId;
		this.currency = currency;
		this.shopId = shopId;
		this.hookUrl = hookUrl;
		this.customFields = customFields;
		this.comment = comment;
		this.failUrl = failUrl;
		this.successUrl = successUrl;
		this.expire = expire;
		this.includeService = includeService;
		this.excludeService = excludeService;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public UUID getShopId() {
		return shopId;
	}

	public void setShopId(UUID shopId) {
		this.shopId = shopId;
	}

	public String getHookUrl() {
		return hookUrl;
	}

	public void setHookUrl(String hookUrl) {
		this.hookUrl = hookUrl;
	}

	public String getCustomFields() {
		return customFields;
	}

	public void setCustomFields(String customFields) {
		this.customFields = customFields;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public URI getFailUrl() {
		return failUrl;
	}

	public void setFailUrl(URI failUrl) {
		this.failUrl = failUrl;
	}

	public URI getSuccessUrl() {
		return successUrl;
	}

	public void setSuccessUrl(URI successUrl) {
		this.successUrl = successUrl;
	}

	public Integer getExpire() {
		return expire;
	}

	public void setExpire(Integer expire) {
		this.expire = expire;
	}

	public List<String> getIncludeService() {
		return includeService;
	}

	public void setIncludeService(List<String> includeService) {
		this.includeService = includeService;
	}

	public List<String> getExcludeService() {
		return excludeService;
	}

	public void setExcludeService(List<String> excludeService) {
		this.excludeService = excludeService;
	}

	public static class InvoiceRequestBuilder {
		private Double amount;
		private String orderId;
		private Currency currency = Currency.RUB;
		private UUID shopId;
		private String hookUrl = null;
		private String customFields = null;
		private String comment = null;
		private URI failUrl = null;
		private URI successUrl = null;
		private Integer expire = 300;
		private List<String> includeService = null;
		private List<String> excludeService = null;

		public InvoiceRequestBuilder setAmount(Double amount) {
			this.amount = amount;
			return this;
		}

		public InvoiceRequestBuilder setOrderId(String orderId) {
			this.orderId = orderId;
			return this;
		}

		public InvoiceRequestBuilder setCurrency(Currency currency) {
			this.currency = currency;
			return this;
		}

		public InvoiceRequestBuilder setShopId(UUID shopId) {
			this.shopId = shopId;
			return this;
		}

		public InvoiceRequestBuilder setHookUrl(String hookUrl) {
			this.hookUrl = hookUrl;
			return this;
		}

		public InvoiceRequestBuilder setCustomFields(String customFields) {
			this.customFields = customFields;
			return this;
		}

		public InvoiceRequestBuilder setComment(String comment) {
			this.comment = comment;
			return this;
		}

		public InvoiceRequestBuilder setFailUrl(URI failUrl) {
			this.failUrl = failUrl;
			return this;
		}

		public InvoiceRequestBuilder setSuccessUrl(URI successUrl) {
			this.successUrl = successUrl;
			return this;
		}

		public InvoiceRequestBuilder setExpire(Integer expire) {
			this.expire = expire;
			return this;
		}

		public InvoiceRequestBuilder setIncludeService(List<String> includeService) {
			this.includeService = includeService;
			return this;
		}

		public InvoiceRequestBuilder setExcludeService(List<String> excludeService) {
			this.excludeService = excludeService;
			return this;
		}

		public InvoiceRequest build() {
			return new InvoiceRequest(amount, orderId, currency, shopId, hookUrl, customFields, comment, failUrl, successUrl, expire, includeService, excludeService);
		}
	}
}
