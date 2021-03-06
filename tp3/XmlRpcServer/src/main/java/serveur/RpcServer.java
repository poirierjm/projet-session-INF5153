/*
 * Copyright 2012 Jacques Berger.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package serveur;

import org.apache.xmlrpc.WebServer;

public class RpcServer {

    static final int HTTP_PORT_NUMBER = 8081;
    
    public static void main(String[] args) {
        try {
            WebServer server = new WebServer(HTTP_PORT_NUMBER);
            server.addHandler("services", new RpcServices());
            server.start();
        } catch (Exception exception) {
            System.err.println(exception);
        }
    }
}
