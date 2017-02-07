package com.netflix.vms.transformer.hollowoutput;

public class SchedulePhaseInfo {
	public long start = 0L;
	public long end = java.lang.Long.MIN_VALUE;
	public boolean isAbsolute = false;
	public boolean isAutomatedImg = false;
	public int sourceVideoId = -1;

	public SchedulePhaseInfo(int sourceVideoId) {
		this.sourceVideoId = sourceVideoId;
	}

	public SchedulePhaseInfo(boolean isAutomatedImg, int sourceVideoId) {
		this.isAutomatedImg = isAutomatedImg;
		this.sourceVideoId = sourceVideoId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof SchedulePhaseInfo)) return false;

		SchedulePhaseInfo that = (SchedulePhaseInfo) o;

		if (start != that.start) return false;
		if (end != that.end) return false;
		if (isAbsolute != that.isAbsolute) return false;
		if (isAutomatedImg != that.isAutomatedImg) return false;
		return sourceVideoId == that.sourceVideoId;
	}

	@Override
	public int hashCode() {
		int result = (int) (start ^ (start >>> 32));
		result = 31 * result + (int) (end ^ (end >>> 32));
		result = 31 * result + (isAbsolute ? 1 : 0);
		result = 31 * result + (isAutomatedImg ? 1 : 0);
		result = 31 * result + sourceVideoId;
		return result;
	}
}
