package com.giero.sma.dto;

import com.giero.sma.entity.Action;

import java.util.Objects;

public class ActionRequestDto {

    private String userId;
    private String gameId;
    private String action;

    public Action toAction() {
        return new Action(userId, gameId, action);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionRequestDto that = (ActionRequestDto) o;
        return Objects.equals(userId, that.userId) && Objects.equals(gameId, that.gameId) && Objects.equals(action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, gameId, action);
    }
}
