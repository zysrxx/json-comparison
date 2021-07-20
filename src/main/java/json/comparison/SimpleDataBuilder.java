/**
 * 
 */
package json.comparison;

import java.util.LinkedList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import json.comparison.entity.ComplexEntity;
import json.comparison.entity.SimpleEntity;



/**  
* @ClassName: SerializeDataBuilder  
* @Description: 序列化数据构建 
* @author zys  
* @date 2020年8月16日    
*/

public class SimpleDataBuilder {
	/**
	* @Title: getBaseSampleEntity  返回基础数据  
	* @return SampleEntity    返回类型  
	* @throws
	 */
	public static SimpleEntity getBaseSampleEntity(){
		SimpleEntity result = new SimpleEntity();
		result.generateRandomData();
		return result;
	}
	/**
	 * getBaseJson 返回基础json样本数据  
	 * @return JSONObject  
	 * @throws
	 */
	public static JSONObject getBaseJson(){
		SimpleEntity result = new SimpleEntity();
		result.generateRandomData();
		return JSON.parseObject(JSON.toJSONString(result));
	}
	/**
	 * getBaseJson 返回基础json样本数据list  
	 * @return JSONArray  
	 * @throws
	 */
	public static JSONArray getBaseJsonList(int size){
		return JSON.parseArray(JSON.toJSONString(getComplexList(size)));
	}
	/**
	* getBaseSampleList  返回指定数量的进出基础样本数据
	* @param  size 返回指定size的数据
	* @param @return    参数  
	* @return List<SampleEntity>    返回类型  
	* @throws
	 */
	public static List<SimpleEntity> getBaseSampleList(int size){
		if(size <= 0){
			System.out.println("size <=0");
			return null;
		}
		List<SimpleEntity> list = new LinkedList<>();
		for(int i=0;i<size;i++){
			SimpleEntity result = new SimpleEntity();
			result.generateRandomData();
			list.add(result);
		}
		return list;
	}
	/**
	* getComplexEntity  返回复杂对象样本数据  
	* @return ComplexEntity    返回类型  
	* @throws
	 */
	public static ComplexEntity getComplexEntity(){
		ComplexEntity result =  new ComplexEntity();
		result.generateRandomData();
		return result;
	}
	/**
	 * getComplexJson 返回层级嵌套json样本数据 
	 * @return ComplexEntity    返回类型  
	 * @throws
	 */
	public static JSONObject getComplexJson(){
		ComplexEntity result =  new ComplexEntity();
		result.generateRandomData();
		return JSON.parseObject(JSON.toJSONString(result));
	}
	/**
	 * getComplexJsonList 返回层级嵌套json样本数据list 
	 * @return JSONArray    返回类型  
	 * @throws
	 */
	public static JSONArray getComplexJsonList(int size){
		return JSON.parseArray(JSON.toJSONString(getComplexList(size)));
	}
	
	/**
	*getComplexList  返回指定数量的复杂样本数据 
	* @param size 样本数据list大小 
	* @return List<ComplexEntity>    返回类型  
	* @throws
	 */
	public static List<ComplexEntity> getComplexList(int size){
		if(size <= 0){
			System.out.println("size <=0");
			return null;
		}
		List<ComplexEntity> list = new LinkedList<>();
		for(int i=0;i<size;i++){
			ComplexEntity result =  new ComplexEntity();
			result.generateRandomData();
			list.add(result);
		}
		return list;
	}
	
	
}
