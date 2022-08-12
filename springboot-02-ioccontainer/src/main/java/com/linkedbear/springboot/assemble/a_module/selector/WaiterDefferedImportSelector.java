package com.linkedbear.springboot.assemble.a_module.selector;

import com.linkedbear.springboot.assemble.a_module.component.Waiter;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class WaiterDeferredImportSelector implements DeferredImportSelector {
    
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("WaiterDeferredImportSelector invoke ......");
        return new String[] {Waiter.class.getName()};
    }
}
