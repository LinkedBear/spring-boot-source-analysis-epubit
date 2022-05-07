package com.linkedbear.springboot.assemble.a_module.anno;

import com.linkedbear.springboot.assemble.a_module.component.Boss;
import com.linkedbear.springboot.assemble.a_module.config.BartenderConfiguration;
import com.linkedbear.springboot.assemble.a_module.registrar.WaiterRegistrar;
import com.linkedbear.springboot.assemble.a_module.selector.BarImportSelector;
import com.linkedbear.springboot.assemble.a_module.selector.WaiterDefferedImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class,
                WaiterDefferedImportSelector.class
        })
public @interface EnableTavern {
    
}
