package org.blueoxygen.cimande.validator;

import org.blueoxygen.cimande.form.ItemForm;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ItemValidator implements Validator{
	
	public boolean supports(Class<?> clazz){
        return ItemForm.class.equals(clazz);
    }
	
	public void validate(Object val, Errors errors){
        ValidationUtils.rejectIfEmpty(errors, "code", "code.empty");
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        ValidationUtils.rejectIfEmpty(errors, "price", "price.empty");
        
    }
	
}
