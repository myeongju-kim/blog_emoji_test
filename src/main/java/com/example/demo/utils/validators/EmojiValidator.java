package com.example.demo.utils.validators;

import com.example.demo.utils.annotations.NotEmoji;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author : kingmj
 * @description :
 * @packageName : com.example.demo.utils.validators
 * @fileName : EmojiValidator
 * @date : 2024. 12. 30.
 */
public class EmojiValidator implements ConstraintValidator<NotEmoji, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null || value.trim().isEmpty()) {
            return true;
        }

        return value.codePoints().noneMatch(Character::isEmoji);
    }
}
