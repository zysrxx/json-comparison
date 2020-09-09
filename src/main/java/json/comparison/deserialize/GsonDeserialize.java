/**
 * 
 */
package json.comparison.deserialize;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import json.comparison.JsonDeserialize;
import json.comparison.entity.ComplexEntity;
import json.comparison.entity.SampleEntity;

/**  
* @ClassName: GsonDeserialize  
* @Description: gson 反序列化  
* @author zysrxx  
* @date 2020年8月16日    
*/
public class GsonDeserialize implements JsonDeserialize {
	private Gson gson = new Gson();
	private JsonParser parser =new JsonParser();;
	/* (non-Javadoc)
	 * @see client.json.deserialize.JsonDeserialize#Deserialize(java.lang.String)
	 */
	@Override
	public Object deserialize(String data,Class<?> clazz,String bigdata) {
		if(clazz == null){
			return parser.parse(data);
		}
		Type listType = null;
		if("list".equals(bigdata)){
			if(SampleEntity.class == clazz){
				listType = new TypeToken<List<SampleEntity>>(){}.getType();
			}else{
				listType = new TypeToken<List<ComplexEntity>>(){}.getType();
			}
			return gson.fromJson(data, listType);
		}else if("object".equals(bigdata)){
			return gson.fromJson(data, clazz);
		}
		return null;
	}

}
