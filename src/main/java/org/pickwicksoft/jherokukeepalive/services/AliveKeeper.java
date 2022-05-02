package org.pickwicksoft.jherokukeepalive.services;

import org.apache.http.client.fluent.Request;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.logging.Logger;

@Service
public class AliveKeeper {

    @Scheduled(fixedDelayString = "PT5M")
    public void callHerokuApp() {
        try {
            Request.Get("http://localhost:8080").execute().discardContent();
        } catch (IOException e) {
            Logger.getLogger("JHerokuKeepAlive").warning(e.getMessage());
        }
    }

}
