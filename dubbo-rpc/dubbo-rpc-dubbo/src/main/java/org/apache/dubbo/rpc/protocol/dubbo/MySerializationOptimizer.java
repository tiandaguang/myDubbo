package org.apache.dubbo.rpc.protocol.dubbo;

import org.apache.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;

/**
 * 描述
 *
 * @author tiandaguang
 * @date 2019/1/25 / 18:35
 * @since 1.0.0
 */
public class MySerializationOptimizer implements SerializationOptimizer {

    @Override
    public Collection<Class> getSerializableClasses() {
//        List<Class> classes = new LinkedList<>();
//        classes.add(BidRequest.class);
//        classes.add(BidResponse.class);
//        classes.add(Device.class);
//        classes.add(Geo.class);
//        classes.add(Impression.class);
//        classes.add(SeatBid.class);
        return null;
    }
}
