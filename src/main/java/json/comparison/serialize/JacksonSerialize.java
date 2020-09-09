/**
 * 
 */
package json.comparison.serialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.comparison.JsonSerialize;

/**  
*JacksonSerialize  
* @Description: jackson序列化  
* @author zysrxx  
* @date 2020年8月16日    
*/
public class JacksonSerialize implements JsonSerialize {
	private ObjectMapper mapper = new ObjectMapper();
	@Override
	public String serialize(Object data) throws JsonProcessingException {
		return mapper.writeValueAsString(data);
	}

}
