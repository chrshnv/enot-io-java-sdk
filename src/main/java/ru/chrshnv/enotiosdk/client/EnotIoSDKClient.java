package ru.chrshnv.enotiosdk.client;

import ru.chrshnv.enotiosdk.other.Response;
import ru.chrshnv.enotiosdk.tariffs.Tariffs;

import java.util.UUID;

public class EnotIoSDKClient {
	private String shopId;
	private String apiKey;

	public EnotIoSDKClient(String shopId, String apiKey) {
		this.shopId = shopId;
		this.apiKey = apiKey;
	}

	public Response<Tariffs> getTariffs(UUID shopId) {

	}
}
