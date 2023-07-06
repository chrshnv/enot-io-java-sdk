package ru.chrshnv.enotiosdk.client.impl;

import ru.chrshnv.enotiosdk.client.EnotIoSDKClient;
import ru.chrshnv.enotiosdk.client.EnotIoSDKClientFactory;

import java.util.UUID;

public class GsonEnotIoSDKClientFactory implements EnotIoSDKClientFactory {
	@Override
	public EnotIoSDKClient create(String apiKey, UUID shopId) {
		return new GsonEnotIoSDKClient(apiKey, shopId);
	}
}
