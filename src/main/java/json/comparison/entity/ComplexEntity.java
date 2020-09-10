/**
 * 
 */
package json.comparison.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import json.comparison.DataBuilder;


/**  
* json测试复杂数据样本实体，基于基础数据实体嵌套两层,为了尽可能保证测试准确性，样本数据尽可能的覆盖了
* Boolean Long Double Date String List Map 等常用数据类型。属性值随机产生，保证每次实体内容会有差异。
* @Description: json测试数据样本实体 
* @author zysrxx  
* @date 2020年8月13日    
*/
public class ComplexEntity implements Serializable {
    private static final long serialVersionUID = -1520171788566678010L;

    private Boolean fieldBoolean;
    private Integer fieldInt;
    private Long fieldLong;
    private Double fieldDouble;
    private Date fieldDate;
    private String fieldStr;
    private List<String> fieldList;
    private Map<String, Object> fieldMap;
    private SimpleEntity sampleEntity;

    /**
     * 随机样本
     */
    public ComplexEntity() {
        Random random = new Random();

        fieldBoolean = random.nextBoolean();
        fieldInt = random.nextInt();
        fieldLong = random.nextLong();
        fieldDouble = random.nextDouble();
        fieldStr = DataBuilder.randomString();

        fieldList = DataBuilder.randomStringList();

        fieldMap = DataBuilder.randomMap();
        setSampleEntity(new SimpleEntity());
    }

    /**
     * 指定List元素数量和Map元素数量的样本
     * @param listSize List元素数量
     * @param mapKeyNum Map元素数量
     */
    public ComplexEntity(int listSize, int mapKeyNum) {
        Random random = new Random();

        fieldBoolean = random.nextBoolean();
        fieldInt = random.nextInt();
        fieldLong = random.nextLong();
        fieldDouble = random.nextDouble();
        fieldDate = new Date();
        fieldStr = DataBuilder.randomString();

        fieldList = DataBuilder.randomStringList(listSize);

        fieldMap = DataBuilder.randomMap(mapKeyNum);
    }

    public Boolean getFieldBoolean() {
        return fieldBoolean;
    }

    public void setFieldBoolean(Boolean fieldBoolean) {
        this.fieldBoolean = fieldBoolean;
    }

    public Integer getFieldInt() {
        return fieldInt;
    }

    public void setFieldInt(Integer fieldInt) {
        this.fieldInt = fieldInt;
    }

    public Long getFieldLong() {
        return fieldLong;
    }

    public void setFieldLong(Long fieldLong) {
        this.fieldLong = fieldLong;
    }

    public Double getFieldDouble() {
        return fieldDouble;
    }

    public void setFieldDouble(Double fieldDouble) {
        this.fieldDouble = fieldDouble;
    }

    public Date getFieldDate() {
        return fieldDate;
    }

    public void setFieldDate(Date fieldDate) {
        this.fieldDate = fieldDate;
    }

    public String getFieldStr() {
        return fieldStr;
    }

    public void setFieldStr(String fieldStr) {
        this.fieldStr = fieldStr;
    }

    public List<String> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<String> fieldList) {
        this.fieldList = fieldList;
    }

    public Map<String, Object> getFieldMap() {
        return fieldMap;
    }

    public void setFieldMap(Map<String, Object> fieldMap) {
        this.fieldMap = fieldMap;
    }

	public SimpleEntity getSampleEntity() {
		return sampleEntity;
	}

	public void setSampleEntity(SimpleEntity sampleEntity) {
		this.sampleEntity = sampleEntity;
	}

}
