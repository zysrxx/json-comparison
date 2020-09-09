/**
 * 
 */
package json.comparison;

/**  
* @ClassName: JsonDeserialize 
* @Description: json反序列化接口 
* @author zysrxx  
* @date 2020年8月16日    
*/
public interface JsonDeserialize {
	Object deserialize(String data,Class<?> clazz,String bigdata) throws Exception;
}
