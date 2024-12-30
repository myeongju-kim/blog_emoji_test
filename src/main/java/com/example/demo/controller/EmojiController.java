package com.example.demo.controller;

import com.example.demo.dto.EmojiRequest;
import com.example.demo.dto.EmojiResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : kingmj
 * @description :
 * @packageName : com.example.demo.controller
 * @fileName : EmojiController
 * @date : 2024. 12. 30.
 */
@RestController
@RequestMapping("/emoji")
public class EmojiController {

    @PostMapping("/reject-include-emoji")
    public ResponseEntity<EmojiResponse> rejectIncludeEmoji(@Valid @RequestBody EmojiRequest request) {
        return ResponseEntity.ok(EmojiResponse.success("이모지 없어서 응답에 성공했습니다."));
    }
}
