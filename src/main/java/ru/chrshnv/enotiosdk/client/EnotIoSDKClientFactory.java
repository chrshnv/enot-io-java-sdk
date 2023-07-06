package ru.chrshnv.enotiosdk.client;

import java.util.UUID;

public interface EnotIoSDKClientFactory {
	EnotIoSDKClient create(String apiKey, UUID shopId);
}
