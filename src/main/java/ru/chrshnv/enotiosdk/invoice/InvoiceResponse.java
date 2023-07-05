package ru.chrshnv.enotiosdk.invoice;

import ru.chrshnv.enotiosdk.other.Currency;

import java.util.UUID;

public class InvoiceResponse {
	private UUID id;
	private String amount;
	private Currency currency;
	private String url;
	private String expired;

	public InvoiceResponse() {
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}
}
