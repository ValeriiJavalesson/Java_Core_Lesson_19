import java.io.*;

public class Methods {
    public static void serialize(File file, Serializable obj) throws Exception {
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(obj);
        oos.close();
    }
    public static Serializable deserealize(File file) throws Exception {
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Serializable o = (Serializable) ois.readObject();
        is.close();
        ois.close();
        return o;

    }
}
