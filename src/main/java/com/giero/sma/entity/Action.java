package com.giero.sma.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Action {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer id;
    private String userId;
    private String gameId;
    private String action;

    public Action(String userId, String gameId, String action) {
        this.userId = userId;
        this.gameId = gameId;
        this.action = action;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        Action action1 = (Action) o;
        return Objects.equals(id, action1.id) && Objects.equals(userId, action1.userId) && Objects.equals(gameId, action1.gameId) && Objects.equals(action, action1.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, gameId, action);
    }
}
