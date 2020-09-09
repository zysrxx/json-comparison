/**
 * 
 */
package json.comparison;

/**  
* @ClassName: JsonSerialize  
* @Description: json序列化接口 
* @author zysrxx  
* @date 2020年8月16日    
*/
public interface JsonSerialize {
	/**
	 * 
	* @Title: serialize  
	* @Description: 序列化方法 
	* @param data 序列化对象  
	* @return String    返回类型  
	* @throws Exception
	 */
	Object serialize(Object data) throws Exception;
}
