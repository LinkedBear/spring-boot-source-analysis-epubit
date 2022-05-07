package com.linkedbear.springboot.assemble.b_profile.selector;

import com.linkedbear.springboot.assemble.b_profile.component.Bar;
import com.linkedbear.springboot.assemble.b_profile.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {
    
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {Bar.class.getName(), BarConfiguration.class.getName()};
    }
}
