package com.shadingsphere.shardingtable.shadingsphere;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @Description
 * @Author hgm
 * @Time 2020/3/26 13:28
 **/
public class PreciseAlgorithmClassName implements PreciseShardingAlgorithm<Integer> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {
        String tName = "user";
        Integer val = preciseShardingValue.getValue();
        tName += (val % 3);
        for (String str : collection) {
            System.out.println(str);
            if(tName.equals(str)){
                System.out.println("return : "+tName);
                return str;
            }
        }
        return null;
    }
}
