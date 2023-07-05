package ru.chrshnv.enotiosdk.client;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ru.chrshnv.enotiosdk.invoice.InvoiceInfoResponse;
import ru.chrshnv.enotiosdk.invoice.InvoiceRequest;
import ru.chrshnv.enotiosdk.invoice.InvoiceResponse;
import ru.chrshnv.enotiosdk.other.Response;
import ru.chrshnv.enotiosdk.tariffs.Tariffs;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.UUID;

public class EnotIoSDKClient {
	private String apiKey;
	private final String enotUrl = "https://api.enot.io/";
	private final HttpClient httpClient = HttpClient.newHttpClient();
	private final Gson gson;

	public EnotIoSDKClient(String apiKey, Gson gson) {
		this.apiKey = apiKey;
		this.gson = gson;
	}

	public Response<Tariffs> getTariffs(UUID shopId) throws URISyntaxException, IOException, InterruptedException {
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

	public Response<InvoiceResponse> createInvoice(InvoiceRequest request) throws IOException, InterruptedException, URISyntaxException {
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
