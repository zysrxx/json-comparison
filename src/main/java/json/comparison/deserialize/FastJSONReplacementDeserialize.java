package json.comparison.deserialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import io.github.qingmo.json.JSON;
import json.comparison.JsonDeserialize;

/**  
* FastJSONReplacementDeserialize
*/
public class FastJSONReplacementDeserialize implements JsonDeserialize {

	@Override
	public Object deserialize(String data,Class<?> clazz,String bigdata) throws JsonMappingException, JsonProcessingException {
		if(clazz == null){
			return JSON.parse(data);
		}
		if("list".equals(bigdata)){
			return JSON.parseArray(data, clazz);
		}else if("object".equals(bigdata)){
			return JSON.parseObject(data, clazz);
		}
		return null;
	}

}
