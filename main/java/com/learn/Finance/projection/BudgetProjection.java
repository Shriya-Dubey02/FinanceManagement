package com.learn.Finance.projection;

import org.springframework.beans.factory.annotation.Value;

public interface BudgetProjection {
	
	@Value("#{target.subcategory?.subCategoryName}")
	String getSubcategory();
	
	String getLimitAmount();
	String getSpent();
	String getRemaining();
	

}
