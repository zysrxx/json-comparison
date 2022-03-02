package json.comparison.deserialize;

import jackson.replaces.fastjson.JSON;
import json.comparison.JsonDeserialize;

/**
 * JacksonReplaceFastjsonDeserialize
 */
public class JacksonReplaceFastjsonDeserialize implements JsonDeserialize {

    @Override
    public Object deserialize(String data, Class<?> clazz, String bigdata) throws Exception {
        if (clazz == null) {
            return JSON.parse(data);
        }
        if ("list".equals(bigdata)) {
            return JSON.parseArray(data, clazz);
        } else if ("object".equals(bigdata)) {
            return JSON.parseObject(data, clazz);
        }
        return null;
    }

}
