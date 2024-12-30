package com.example.demo.utils.annotations;

import com.example.demo.utils.validators.EmojiValidator;
import jakarta.validation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : kingmj
 * @description :
 * @packageName : com.example.demo.utils.annotations
 * @fileName : isEmoji
 * @date : 2024. 12. 30.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmojiValidator.class)
public @interface NotEmoji {
    String message() default "이모지를 제외하고 입력해주세요.";
    Class[] groups() default {};
    Class[] payload() default {};
}
