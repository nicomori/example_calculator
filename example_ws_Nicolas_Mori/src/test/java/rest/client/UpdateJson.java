package rest.client;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;

import rest.Post;

/**
 * This Class is created for make all the updates of the json.
 */
public class UpdateJson {

	/**
	 * this method is created for get a register from the json.
	 * 
	 * @param url
	 *            of the conection with the json server.
	 * @param id
	 *            of the register.
	 * @param userId
	 *            of the register.
	 * @param title
	 *            of the updated register.
	 * @param body
	 *            of the updated register.
	 * 
	 * @return false in case the id don't exist in the json.
	 * @return true in case the change is completed.
	 */
	public static boolean editARecordWithParameters(String url, int id, int userId, String title, String body) {
		Post post = null;

		try {
			post = GetJson.getRegister(url, id);
			if (post.getId() != id) {
				System.out.println("the ID don't exist");
				return false;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("id", id);
			jsonObj.put("userId", userId);
			jsonObj.put("title", title);
			jsonObj.put("body", body);
			jsonObj.put("email", post.getEmail());

			StringEntity entity = new StringEntity(jsonObj.toString(), HTTP.UTF_8);

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpPost postRequest = new HttpPost(url);

			entity.setContentType("application/json");
			postRequest.setEntity(entity);
			@SuppressWarnings("unused")
			HttpResponse response = httpClient.execute(postRequest);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
}