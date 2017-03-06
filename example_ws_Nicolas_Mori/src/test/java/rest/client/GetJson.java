package rest.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.Gson;

import rest.Post;


/**
 * This Class is created for make all the calls of the json.
 */
public class GetJson {

	/**
	 * this method is created for get a register from the json.
	 * 
	 * @param url of the conection with the json server.
	 * @param id of the register.
	 * @return this method return a object of the class Post.
	 */
	public static Post getRegister(String url, int id) throws Exception {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url + "/" + id);
		httpGet.addHeader("accept", "application/json");
		HttpResponse response = httpClient.execute(httpGet);
		String post = readData(response);
		Gson gson = new Gson();
		return gson.fromJson(post, Post.class);
	}

	/**
	 * this method read the data of register.
	 * 
	 * @param HttpResponse object
	 * @return String with the data of the register
	 */
	public static String readData(HttpResponse httpResponse) throws Exception {
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
			StringBuffer buffer = new StringBuffer();
			char[] dataLength = new char[1024];
			int read;
			while ((read = bufferReader.read(dataLength)) != -1) {
				buffer.append(dataLength, 0, read);
			}
			return buffer.toString();
		} catch (Exception e) {
			throw e;
		} finally {
			if (bufferReader != null)
				bufferReader.close();
		}
	}
}