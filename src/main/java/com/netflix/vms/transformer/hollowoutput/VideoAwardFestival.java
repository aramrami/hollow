package com.netflix.vms.transformer.hollowoutput;


public class VideoAwardFestival implements Cloneable {

    public int id = java.lang.Integer.MIN_VALUE;

    public VideoAwardFestival() { }

    public VideoAwardFestival(int value) {
        this.id = value;
    }

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof VideoAwardFestival))
            return false;

        VideoAwardFestival o = (VideoAwardFestival) other;
        if(o.id != id) return false;
        return true;
    }

    public VideoAwardFestival clone() {
        try {
            return (VideoAwardFestival)super.clone();
        } catch (CloneNotSupportedException cnse) { throw new RuntimeException(cnse); }
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}