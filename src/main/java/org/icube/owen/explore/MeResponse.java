package org.icube.owen.explore;

public class MeResponse {

	private int stronglyAgree;
	private int agree;
	private int neutral;
	private int disagree;
	private int stronglyDisagree;
	private double average;

	public int getStronglyAgree() {
		return stronglyAgree;
	}

	public void setStronglyAgree(int stronglyAgree) {
		this.stronglyAgree = stronglyAgree;
	}

	public int getAgree() {
		return agree;
	}

	public void setAgree(int agree) {
		this.agree = agree;
	}

	public int getNeutral() {
		return neutral;
	}

	public void setNeutral(int neutral) {
		this.neutral = neutral;
	}

	public int getDisagree() {
		return disagree;
	}

	public void setDisagree(int disagree) {
		this.disagree = disagree;
	}

	public int getStronglyDisagree() {
		return stronglyDisagree;
	}

	public void setStronglyDisagree(int stronglyDisagree) {
		this.stronglyDisagree = stronglyDisagree;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

}
