package com.ranaivoson.inligneBiblio.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MessageResponse {
    private String message;
    private String redirectUrl;

    public MessageResponse(String message) {
        this.message = message;
    }

    public MessageResponse(String message, String redirectUrl) {
        this.message = message;
        this.redirectUrl = redirectUrl;
    }
}
