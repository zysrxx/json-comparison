
package json.comparison.serialize;

import jackson.replaces.fastjson.JSON;
import json.comparison.JsonSerialize;

/**  
*	JacksonReplaceFastjsonSerialize
*/
public class JacksonReplaceFastjsonSerialize implements JsonSerialize {
	@Override
	public String serialize(Object data) throws Exception {
		return JSON.toJSONString(data);
	}

}
