import static spark.Spark.*;

public class ApiHello {
    public static void main(String[] args) {
        secure(getKeyStore(), getPwdKeyStore(), null, null);
        port(getPort());
        get("/hello", (req, res) -> "Llamado de la api por ssl");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }

    static String getKeyStore(){
        if (System.getenv("KEY_STORE") != null) {
            return System.getenv("KEY_STORE");
        }
        return "target/cert/apikeystore.p12";
    }

    static String getPwdKeyStore(){
        if (System.getenv("PWD_KEYSTORE") != null) {
            return System.getenv("PWD_KEYSTORE");
        }
        return "clave123";
    }


//    keytool -genkeypair -alias ecikeypair -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore ecikeystore.p12 -validity 3650
}