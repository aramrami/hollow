package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectDelegate;


@SuppressWarnings("all")
public interface RightsWindowDelegate extends HollowObjectDelegate {

    public long getStartDate(int ordinal);

    public Long getStartDateBoxed(int ordinal);

    public long getEndDate(int ordinal);

    public Long getEndDateBoxed(int ordinal);

    public boolean getOnHold(int ordinal);

    public Boolean getOnHoldBoxed(int ordinal);

    public int getContractIdsExtOrdinal(int ordinal);

    public RightsWindowTypeAPI getTypeAPI();

}