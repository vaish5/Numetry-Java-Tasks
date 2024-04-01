package com.api.formapidemo.response;

import java.time.LocalDateTime;

public class LastLogoutResponse {
    private LocalDateTime lastLogout;

    public LastLogoutResponse(LocalDateTime lastLogout) {
        this.lastLogout = lastLogout;
    }

    public LocalDateTime getLastLogout() {
        return lastLogout;
    }

    public void setLastLogout(LocalDateTime lastLogout) {
        this.lastLogout = lastLogout;
    }
}
