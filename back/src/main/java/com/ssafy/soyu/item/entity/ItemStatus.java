package com.ssafy.soyu.item.entity;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ItemStatus {
  // 차례로 온라인, DP, 판매완료, 삭제됨, 예약중, 회수 대기 중;
  ONLINE, DP, SOLD, DELETED, RESERVE, WITHDRAW;
  @JsonCreator
  public static ItemStatus from(String s) {
    return ItemStatus.valueOf(s.toUpperCase());
  }
}
