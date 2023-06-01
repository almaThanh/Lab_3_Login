package tranhanhtrithienthanh.Lab_3.validator;
import tranhanhtrithienthanh.Lab_3.entity.Category;
import tranhanhtrithienthanh.Lab_3.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements  ConstraintValidator<ValidCategoryId, Category>{
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context) {
        return category != null && category.getId() != null;
    }
}
