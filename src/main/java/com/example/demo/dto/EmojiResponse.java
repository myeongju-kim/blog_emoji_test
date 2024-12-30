package com.example.demo.dto;

import lombok.Getter;

/**
 * @author : kingmj
 * @description :
 * @packageName : com.example.demo.dto
 * @fileName : EmojiResponse
 * @date : 2024. 12. 30.
 */
@Getter
public class EmojiResponse {
    private boolean isSuccess;
    private String message;

    private EmojiResponse(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }

    public static EmojiResponse success(String message){
        return new EmojiResponse(true, message);
    }

    public static EmojiResponse fail(String message){
        return new EmojiResponse(false, message);
    }
}
