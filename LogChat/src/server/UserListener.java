package server;

import packet.Msg;

public interface UserListener {
     enum Status { LoggedIn, LoggedOut }

    void userStatusChanged(Status status, Client c);
     void userSendMessage(Msg message);
}
