package ru.chrshnv.enotiosdk.client;

import ru.chrshnv.enotiosdk.invoice.InvoiceInfoResponse;
import ru.chrshnv.enotiosdk.invoice.InvoiceResponse;
import ru.chrshnv.enotiosdk.other.Currency;
import ru.chrshnv.enotiosdk.other.Response;
import ru.chrshnv.enotiosdk.tariffs.Tariffs;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface EnotIoSDKClient {
	Response<Tariffs> getTariffs() throws URISyntaxException, IOException, InterruptedException;
	Response<InvoiceResponse> createInvoice(Double amount, String orderId) throws URISyntaxException, IOException, InterruptedException;
	Response<InvoiceResponse> createInvoice(Double amount, String orderId, Currency currency, String hookUrl, String customFields, String comment, URI failUrl, URI successUrl, Integer expire, List<String> includeService, List<String> excludeService) throws URISyntaxException, IOException, InterruptedException;
	Response<InvoiceInfoResponse> invoiceInfo(UUID shopId, UUID invoiceId, String orderId) throws URISyntaxException, IOException, InterruptedException;
}
