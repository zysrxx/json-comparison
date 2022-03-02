
package json.comparison.serialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.github.qingmo.json.JSON;
import json.comparison.JsonSerialize;

/**  
*	FastJSONReplacementSerialize
*/
public class FastJSONReplacementSerialize implements JsonSerialize {
	@Override
	public String serialize(Object data) throws JsonProcessingException {
		return JSON.toJSONString(data);
	}

}
