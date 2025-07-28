package com.java.design.pattern.creational.builder;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

	//Required
	private final String url;
	
	//optional
	private final String method;
	private final Map<String,String> headers;
	private final Map<String,String> queryParams;
	private final String body;
	private final int timeout;
	
	//private Constructor
	private HttpRequest(Builder builder) {
		this.url = builder.url;
		this.method = builder.method;
		this.headers = builder.headers;
		this.queryParams = builder.queryParams;
		this.body = builder.body;
		this.timeout = builder.timeout;
	}
	
	
	

	@Override
	public String toString() {
		return "HttpRequest [url=" + url + ", method=" + method + ", headers=" + headers + ", queryParams="
				+ queryParams + ", body=" + body + ", timeout=" + timeout + "]";
	}




	public static class Builder{
		//Required
		private final String url;
		
		//optional
		private String method = "GET";
		private Map<String,String> headers = new HashMap<>();
		private Map<String,String> queryParams = new HashMap<>();
		private String body;
		private int timeout=30000;
		
		public Builder(String url) {
			this.url = url;
		}
		
		public Builder addMethod(String method) {
			this.method = method;
			return this;
		}
		
		public Builder addHeader(String key,String value) {
			this.headers.put(key, value);
			return this;
		}
		
		public Builder addQueryParams(String key,String value) {
			this.queryParams.put(key, value);
			return this;
		}
		
		public Builder body(String body) {
			this.body = body;
			return this;
		}
		
		public Builder timeout(int timeout) {
			this.timeout = timeout;
			return this;
		}
		
		public HttpRequest build() {
			return new HttpRequest(this);
		}
	}

}
