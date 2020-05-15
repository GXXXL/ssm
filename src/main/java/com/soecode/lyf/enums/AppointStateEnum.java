package com.soecode.lyf.enums;

/**
 * 使用枚举表述常量数据字典
 */
public enum AppointStateEnum {

	SUCCESS(1, "预约成功"), NO_NUMBER(0, "库存不足"), REPEAT_APPOINT(-1, "重复预约"), INNER_ERROR(-2, "系统异常");

	private int status;

	private String statusInfo;

	private AppointStateEnum(int status, String statusInfo) {
		this.status = status;
		this.statusInfo = statusInfo;
	}

	public int getState() {
		return status;
	}

	public String getStateInfo() {
		return statusInfo;
	}

	public static AppointStateEnum statusOf(int index) {
		for (AppointStateEnum status : values()) {
			if (status.getState() == index) {
				return status;
			}
		}
		return null;
	}

}
