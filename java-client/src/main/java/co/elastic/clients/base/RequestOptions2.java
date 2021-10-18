package co.elastic.clients.base;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class RequestOptions2 {

    public static final RequestOptions2 DEFAULT = new RequestOptions2(
            Arrays.asList(
                    new ClientMetadata.Header(new ClientMetadata()),
                    UserAgent.Header.DEFAULT
            )
    );

    private final Map<String, Header> headers;

    public RequestOptions2(Iterable<Header> headers) {
        this.headers = new TreeMap<>(String::compareToIgnoreCase);
        headers.forEach(this::putHeader);
    }

    public Iterable<Header> headers() {
        return headers.values();
    }

    void putHeader(Header header) {
        this.headers.put(header.name(), header);
    }

    public RequestOptions2 with(RequestOptions2 other) {
        RequestOptions2 options = new RequestOptions2(headers());
        if (other != null) {
            other.headers().forEach(options::putHeader);
        }
        return options;
    }

}
