/**
 * 
 */
package json.comparison.deserialize;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.comparison.JsonDeserialize;

/**  
* @ClassName: JacksonDeserialize  
* @Description: Jackson 反序列化  
* @author zysrxx  
* @date 2020年8月16日    
*/
public class JacksonDeserialize implements JsonDeserialize {
	private ObjectMapper mapper = new ObjectMapper();
	
	@Override
	public Object deserialize(String data,Class<?> clazz,String bigdata) throws JsonMappingException, JsonProcessingException {
		if(clazz == null){
			return mapper.readTree(data);
		}
		if("list".equals(bigdata)){
			JavaType javaType = mapper.getTypeFactory().constructCollectionType(List.class, clazz);
			return mapper.readValue(data, javaType);
		}else if("object".equals(bigdata)){
			return mapper.readValue(data, clazz);
		}
		return null;
	}

}
