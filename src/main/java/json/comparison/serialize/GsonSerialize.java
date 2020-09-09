/**
 * 
 */
package json.comparison.serialize;

import com.google.gson.Gson;

import json.comparison.JsonSerialize;

/**  
* @ClassName: GsonSerialize  
* @Description: gson序列化  
* @author zysrxx  
* @date 2020年8月16日    
*/
public class GsonSerialize implements JsonSerialize {
	private Gson  gson = new Gson();
	@Override
	public String serialize(Object data) {
		return gson.toJson(data);
	}

}
