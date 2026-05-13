public class ServerRunner {
    public static void main(String[] args) {
        String[] apps = {"MySQL Database", "Apache Web Server", "Docker"};

        Hardware[] parts = new Hardware[3];
        parts[0] = new Hardware("RAM", 64);
        parts[1] = new Hardware("SSD Storage", 1024);
        parts[2] = new Hardware("Video Buffer", 8);

        Server myServer = new Server(apps, parts);
        myServer.displayServerComponents();
    }
}