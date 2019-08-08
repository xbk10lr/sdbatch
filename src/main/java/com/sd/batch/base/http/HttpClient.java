package com.sd.batch.base.http;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;

import javax.naming.CommunicationException;

import lombok.extern.slf4j.Slf4j;

/**
 * HttpClient
 * 
 */
@Slf4j
public class HttpClient {

	/**
	 * 发送信息到服务端
	 * 
	 * @param data
	 * @param encoding
	 * @return
	 * @throws Exception
	 */
	public String send(Map<String, String> data, HttpConfig httpConfig) throws Exception {
		try {
			HttpURLConnection httpURLConnection = createConnection(httpConfig);
			this.requestServer(httpURLConnection, this.getRequestParamString(data, httpConfig.getEncoding()), httpConfig.getEncoding());
			return this.response(httpURLConnection, httpConfig.getEncoding());
		} catch (Exception e) {
			throw e;
		}
	}
	
	public String send(String data, HttpConfig httpConfig) throws Exception {
		try {
			HttpURLConnection httpURLConnection = createConnection(httpConfig);
			this.requestServer(httpURLConnection, data, httpConfig.getEncoding());
			return this.response(httpURLConnection, httpConfig.getEncoding());
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * HTTP Post发送消息
	 *
	 * @param connection
	 * @param message
	 * @throws IOException
	 */
	private void requestServer(final URLConnection connection, String message, String encoder) throws Exception {
		PrintStream out = null;
		try {
			connection.connect();
			out = new PrintStream(connection.getOutputStream(), false, encoder);
			out.print(message);
			out.flush();
		} catch (Exception e) {
			throw e;
		} finally {
			if (null != out) {
				out.close();
			}
		}
	}

	/**
	 * 显示Response消息
	 *
	 * @param connection
	 * @param CharsetName
	 * @return
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	private String response(final HttpURLConnection connection, String encoding)
			throws URISyntaxException, IOException, Exception {
		InputStream in = null;
		StringBuilder sb = new StringBuilder(1024);
		BufferedReader br = null;
		try {
			int status= connection.getResponseCode();
			log.info("HTTP Return Status-Code:[" + status + "]");
			if (200 == connection.getResponseCode()) {
				in = connection.getInputStream();
				sb.append(new String(read(in), encoding));
				return sb.toString();
			} else {
				in = connection.getErrorStream();
				sb.append(new String(read(in), encoding));
				throw new CommunicationException("返回状态码：" + status+" ,返回信息:"+sb.toString());
			}
		} catch (Exception e) {
			throw e;
		} finally {
			if (null != br) {
				br.close();
			}
			if (null != in) {
				in.close();
			}
			if (null != connection) {
				connection.disconnect();
			}
		}
	}

	public static byte[] read(InputStream in) throws IOException {
		byte[] buf = new byte[1024];
		int length = 0;
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		while ((length = in.read(buf, 0, buf.length)) > 0) {
			bout.write(buf, 0, length);
		}
		bout.flush();
		return bout.toByteArray();
	}

	/**
	 * 创建连接
	 *
	 * @return
	 * @throws ProtocolException
	 */
	private HttpURLConnection createConnection(HttpConfig httpConfig) throws Exception {
		HttpURLConnection httpURLConnection = null;
		try {
			URL url = new URL(httpConfig.getRequestUrl());
			httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setConnectTimeout(httpConfig.getConnectionTimeOut());// 连接超时时间
			httpURLConnection.setReadTimeout(httpConfig.getReadTimeOut());// 读取结果超时时间
			httpURLConnection.setDoInput(true); // 可读
			httpURLConnection.setDoOutput(true); // 可写
			httpURLConnection.setUseCaches(false);// 取消缓存
			httpURLConnection.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=" + httpConfig.getEncoding());
			httpURLConnection.setRequestMethod("POST");
		} catch (Exception e) {
			throw new Exception(e);
		}

		return httpURLConnection;
	}
	
	/**
	 * 将Map存储的对象，转换为key=value&key=value的字符
	 *
	 * @param requestParam
	 * @param coder
	 * @return
	 */
	private String getRequestParamString(Map<String, String> requestParam, String coder) {
		if (null == coder || "".equals(coder)) {
			coder = "UTF-8";
		}
		StringBuffer sf = new StringBuffer("");
		String reqstr = "";
		if (null != requestParam && 0 != requestParam.size()) {
			for (Entry<String, String> en : requestParam.entrySet()) {
				try {
					sf.append(en.getKey() + "=" + (null == en.getValue() || "".equals(en.getValue()) ? ""
							: URLEncoder.encode(en.getValue(), coder)) + "&");
				} catch (UnsupportedEncodingException e) {
					log.error(e.getMessage());
					return "";
				}
			}
			reqstr = sf.substring(0, sf.length() - 1);
		}
		log.info("请求报文:[" + reqstr + "]");
		return reqstr;
	}
}