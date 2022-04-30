package org.pickwicksoft.jherokukeepalive;

import org.pickwicksoft.jherokukeepalive.services.AliveKeeper;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@EnableScheduling
@Import(AliveKeeper.class)
public @interface HerokuKeepAlive {
}
