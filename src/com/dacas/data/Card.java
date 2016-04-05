package com.dacas.data;

import org.json.JSONObject;

public class Card {
    Integer id;
    String cardSn;
    Integer status;
    Integer color;
    String publicKey;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCardSn() {
        return cardSn;
    }
    public void setCardSn(String cardSn) {
        this.cardSn = cardSn;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getColor() {
        return color;
    }
    public void setColor(Integer color) {
        this.color = color;
    }
    public String getPublicKey() {
        return publicKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String toString(){
        JSONObject object = new JSONObject();
        try {
            object.put("id", id);
            object.put("public_key", publicKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.toString();
    }

}
