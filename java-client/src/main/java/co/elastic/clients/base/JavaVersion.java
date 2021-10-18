package co.elastic.clients.base;

public class JavaVersion extends Version {

    public static Version load() {
        return parse(System.getProperty("java.version"));
    }

    public JavaVersion(int major, int minor, int maintenance, boolean isPreRelease) {
        super(major, minor, maintenance, isPreRelease);
    }

}
