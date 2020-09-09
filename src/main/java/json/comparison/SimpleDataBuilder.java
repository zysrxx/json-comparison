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
import json.comparison.entity.SampleEntity;



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
	public static SampleEntity getBaseSampleEntity(){
		return new SampleEntity();
	}
	/**
	 * getBaseJson 返回基础json样本数据  
	 * @return JSONObject  
	 * @throws
	 */
	public static JSONObject getBaseJson(){
		return JSON.parseObject(JSON.toJSONString(new SampleEntity()));
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
	public static List<SampleEntity> getBaseSampleList(int size){
		if(size <= 0){
			System.out.println("size <=0");
			return null;
		}
		List<SampleEntity> list = new LinkedList<>();
		for(int i=0;i<size;i++){
			list.add(new SampleEntity());
		}
		return list;
	}
	/**
	* getComplexEntity  返回复杂对象样本数据  
	* @return ComplexEntity    返回类型  
	* @throws
	 */
	public static ComplexEntity getComplexEntity(){
		return new ComplexEntity();
	}
	/**
	 * getComplexJson 返回层级嵌套json样本数据 
	 * @return ComplexEntity    返回类型  
	 * @throws
	 */
	public static JSONObject getComplexJson(){
		return JSON.parseObject(JSON.toJSONString(new ComplexEntity()));
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
			list.add(new ComplexEntity());
		}
		return list;
	}
	
	
}
