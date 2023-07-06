package ru.chrshnv.enotiosdk.client.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ru.chrshnv.enotiosdk.client.EnotIoSDKClient;
import ru.chrshnv.enotiosdk.invoice.InvoiceInfoResponse;
import ru.chrshnv.enotiosdk.invoice.InvoiceRequest;
import ru.chrshnv.enotiosdk.invoice.InvoiceResponse;
import ru.chrshnv.enotiosdk.other.Currency;
import ru.chrshnv.enotiosdk.other.Response;
import ru.chrshnv.enotiosdk.tariffs.Tariffs;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.UUID;

public class GsonEnotIoSDKClient implements EnotIoSDKClient {
	private final String apiKey;
	private final UUID shopId;
	private final String enotUrl = "https://api.enot.io/";
	private final HttpClient httpClient = HttpClient.newHttpClient();
	private final Gson gson = new GsonBuilder().create();

	public GsonEnotIoSDKClient(String apiKey, UUID shopId) {
		this.apiKey = apiKey;
		this.shopId = shopId;
	}

	@Override
	public Response<Tariffs> getTariffs() throws URISyntaxException, IOException, InterruptedException {
		URI url = new URI(enotUrl + "/shops/" + shopId + "/payment-tariffs");
		HttpRequest req = HttpRequest
			.newBuilder()
			.uri(url)
			.header("Content-Type", "application/json")
			.header("x-api-key", apiKey)
			.GET()
			.build();

		HttpResponse<String> stringHttpResponse = httpClient.send(req, HttpResponse.BodyHandlers.ofString());
		Type responseType = TypeToken.getParameterized(Response.class, Tariffs.class).getType();

		return gson.fromJson(stringHttpResponse.body(), responseType);
	}

	@Override
	public Response<InvoiceResponse> createInvoice(Double amount, String orderId) throws URISyntaxException, IOException, InterruptedException {
		InvoiceRequest build = InvoiceRequest.builder()
			.setAmount(amount)
			.setOrderId(orderId)
			.setShopId(shopId)
			.build();

		return getInvoiceResponseResponse(build);
	}

	@Override
	public Response<InvoiceResponse> createInvoice(Double amount, String orderId, Currency currency, String hookUrl, String customFields, String comment, URI failUrl, URI successUrl, Integer expire, List<String> includeService, List<String> excludeService) throws URISyntaxException, IOException, InterruptedException {
		InvoiceRequest request = new InvoiceRequest(amount, orderId, currency, shopId, hookUrl, customFields, comment, failUrl, successUrl, expire, includeService, excludeService);

		return getInvoiceResponseResponse(request);
	}

	private Response<InvoiceResponse> getInvoiceResponseResponse(InvoiceRequest request) throws URISyntaxException, IOException, InterruptedException {
		String body = gson.toJson(request);

		URI url = new URI(enotUrl + "/invoice/create");
		HttpRequest req = HttpRequest
			.newBuilder()
			.uri(url)
			.header("Content-Type", "application/json")
			.header("x-api-key", apiKey)
			.POST(HttpRequest.BodyPublishers.ofString(body))
			.build();

		HttpResponse<String> stringHttpResponse = httpClient.send(req, HttpResponse.BodyHandlers.ofString());
		Type responseType = TypeToken.getParameterized(Response.class, InvoiceResponse.class).getType();

		return gson.fromJson(stringHttpResponse.body(), responseType);
	}

	@Override
	public Response<InvoiceInfoResponse> invoiceInfo(UUID shopId, UUID invoiceId, String orderId) throws URISyntaxException, IOException, InterruptedException {
		URI url = new URI(enotUrl + "/invoice/info?invoice_id=" + invoiceId + "&shop_id=" + shopId + "&order_id=" + orderId);

		HttpRequest req = HttpRequest
			.newBuilder()
			.uri(url)
			.header("Content-Type", "application/json")
			.header("x-api-key", apiKey)
			.GET()
			.build();

		HttpResponse<String> stringHttpResponse = httpClient.send(req, HttpResponse.BodyHandlers.ofString());
		Type responseType = TypeToken.getParameterized(Response.class, InvoiceInfoResponse.class).getType();

		return gson.fromJson(stringHttpResponse.body(), responseType);
	}
}
