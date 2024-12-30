package com.example.demo.dto;

import com.example.demo.utils.annotations.NotEmoji;
import jakarta.validation.constraints.NotEmpty;

/**
 * @author : kingmj
 * @description :
 * @packageName : com.example.demo.dto
 * @fileName : EmojiRequest
 * @date : 2024. 12. 30.
 */
public record EmojiRequest(
        @NotEmoji
        String name,
        int age
) {
}
