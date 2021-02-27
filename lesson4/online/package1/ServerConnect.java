package lesson4.online.package1;

import lesson4.online.Endpoints;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 24.02.2021
 */

public class ServerConnect {

    public ServerConnect() {
        connect(Endpoints.url2);
    }

    void connect(String url) {
        System.out.println("connect to " + url);
    }

    public static boolean testSelfConnection(int value) {
        return 15 == value;
    }


}
