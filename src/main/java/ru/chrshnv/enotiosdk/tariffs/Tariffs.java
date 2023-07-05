package ru.chrshnv.enotiosdk.tariffs;

import com.google.gson.annotations.SerializedName;
import ru.chrshnv.enotiosdk.other.TariffStatus;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Tariffs {
	private List<Tariff> tariffs = new ArrayList<>();

	public Tariffs() {
	}

	public Tariffs(List<Tariff> tariffs) {
		this.tariffs = tariffs;
	}

	public List<Tariff> getTariffs() {
		return tariffs;
	}

	public void setTariffs(List<Tariff> tariffs) {
		this.tariffs = tariffs;
	}

	public static class Tariff {
		private Double percent;

		@SerializedName("max_sum")
		private Double maxSum;

		@SerializedName("shop_percent")
		private Double shopPercent;

		@SerializedName("user_percent")
		private Double userPercent;

		private String service;

		@SerializedName("service_label")
		private String serviceLabel;

		private Currency currency;
		private TariffStatus status;

		public Tariff() {
		}

		public Double getPercent() {
			return percent;
		}

		public void setPercent(Double percent) {
			this.percent = percent;
		}

		public Double getMaxSum() {
			return maxSum;
		}

		public void setMaxSum(Double maxSum) {
			this.maxSum = maxSum;
		}

		public Double getShopPercent() {
			return shopPercent;
		}

		public void setShopPercent(Double shopPercent) {
			this.shopPercent = shopPercent;
		}

		public Double getUserPercent() {
			return userPercent;
		}

		public void setUserPercent(Double userPercent) {
			this.userPercent = userPercent;
		}

		public String getService() {
			return service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public String getServiceLabel() {
			return serviceLabel;
		}

		public void setServiceLabel(String serviceLabel) {
			this.serviceLabel = serviceLabel;
		}

		public Currency getCurrency() {
			return currency;
		}

		public void setCurrency(Currency currency) {
			this.currency = currency;
		}

		public TariffStatus getStatus() {
			return status;
		}

		public void setStatus(TariffStatus status) {
			this.status = status;
		}
	}
}
