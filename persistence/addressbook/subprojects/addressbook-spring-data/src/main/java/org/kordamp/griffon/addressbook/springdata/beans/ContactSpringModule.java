/*
 * Copyright 2016-2018 Andres Almiray
 *
 * This file is part of Griffon Examples
 *
 * Griffon Examples is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Griffon Examples is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Griffon Examples. If not, see <http://www.gnu.org/licenses/>.
 */
package org.kordamp.griffon.addressbook.springdata.beans;

import com.google.inject.Module;
import org.kordamp.jipsy.ServiceProviderFor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.guice.module.SpringModule;

@DependsOn("application-spring-data")
@ServiceProviderFor(Module.class)
public class ContactSpringModule extends SpringModule {
    public ContactSpringModule() {
        super(createApplicationContext());
    }

    private static ApplicationContext createApplicationContext() {
        return new AnnotationConfigApplicationContext(ContactConfiguration.class);
    }
}
