/**
 * 
 */
package json.comparison.deserialize;

import com.alibaba.fastjson.JSON;

import json.comparison.JsonDeserialize;

/**  
* @ClassName: FastjsonDeserialize  
* @Description: fastjson 反序列化  
* @author zysrxx  
* @date 2020年8月16日    
*/
public class FastjsonDeserialize implements JsonDeserialize {

	
	@Override
	public Object deserialize(String data,Class<?> clazz,String bigdata) {
		
		if("list".equals(bigdata)){
			return JSON.parseArray(data, clazz);
		}else if("object".equals(bigdata)){
			return JSON.parseObject(data, clazz);
		}
		return null;
	}

}
