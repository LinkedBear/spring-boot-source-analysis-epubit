package com.linkedbear.springboot.assemble.a_module.selector;

import com.linkedbear.springboot.assemble.a_module.component.Bar;
import com.linkedbear.springboot.assemble.a_module.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {
    
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("BarImportSelector invoke ......");
        return new String[] {Bar.class.getName(), BarConfiguration.class.getName()};
    }
}
