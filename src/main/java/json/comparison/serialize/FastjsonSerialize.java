/**
 * 
 */
package json.comparison.serialize;

import com.alibaba.fastjson.JSON;

import json.comparison.JsonSerialize;

/**  
* @ClassName: FastjsonSerialize  
* @Description: fastjson序列化  
* @author zysrxx  
* @date 2020年8月16日    
*/
public class FastjsonSerialize implements JsonSerialize {

	@Override
	public String serialize(Object data) {
		return JSON.toJSONString(data);
	}

}
