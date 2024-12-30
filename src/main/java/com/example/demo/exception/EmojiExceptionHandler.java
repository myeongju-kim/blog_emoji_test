package com.example.demo.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : kingmj
 * @description :
 * @packageName : com.example.demo.exception
 * @fileName : EmojiExceptionHandler
 * @date : 2024. 12. 30.
 */
@RestControllerAdvice
public class EmojiExceptionHandler {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public void globalException(MethodArgumentNotValidException ex) {
        System.out.println("TWEATESTESTSETSET");
    }
}
