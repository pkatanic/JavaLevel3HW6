package server;

import packet.Msg;

import java.util.ArrayList;

public interface ServerListener {
    enum Status{UP,DOWN}
    void serverStatusChanged(Status status);
    void userConnectedDisconnected(ArrayList<String> userList);
    void gotMessage(Msg message);
}
