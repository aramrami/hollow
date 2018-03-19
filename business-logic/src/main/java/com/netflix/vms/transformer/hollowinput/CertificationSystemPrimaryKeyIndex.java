package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.api.consumer.HollowConsumer;
import com.netflix.hollow.api.consumer.index.AbstractHollowUniqueKeyIndex;
import com.netflix.hollow.core.schema.HollowObjectSchema;

@SuppressWarnings("all")
public class CertificationSystemPrimaryKeyIndex extends AbstractHollowUniqueKeyIndex<VMSHollowInputAPI, CertificationSystemHollow> {

    public CertificationSystemPrimaryKeyIndex(HollowConsumer consumer) {
        this(consumer, false);    }

    public CertificationSystemPrimaryKeyIndex(HollowConsumer consumer, boolean isListenToDataRefreah) {
        this(consumer, isListenToDataRefreah, ((HollowObjectSchema)consumer.getStateEngine().getSchema("CertificationSystem")).getPrimaryKey().getFieldPaths());
    }

    public CertificationSystemPrimaryKeyIndex(HollowConsumer consumer, String... fieldPaths) {
        this(consumer, true, fieldPaths);
    }

    public CertificationSystemPrimaryKeyIndex(HollowConsumer consumer, boolean isListenToDataRefreah, String... fieldPaths) {
        super(consumer, "CertificationSystem", isListenToDataRefreah, fieldPaths);
    }

    public CertificationSystemHollow findMatch(Object... keys) {
        int ordinal = idx.getMatchingOrdinal(keys);
        if(ordinal == -1)
            return null;
        return api.getCertificationSystemHollow(ordinal);
    }

}