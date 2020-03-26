package com.shadingsphere.shardingdb.shadingsphere;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @Description
 * @Author hangaoming
 * @Time 2020/3/26 13:28
 **/
public class PreciseAlgorithmClassName implements PreciseShardingAlgorithm<Integer> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {
        String dbName = "db";
        Integer val = preciseShardingValue.getValue();
        System.out.println(val);
        dbName += (val % 2);
        for (String str : collection) {
            if(dbName.equals(str)){
                return str;
            }
        }
        return null;
    }
}
