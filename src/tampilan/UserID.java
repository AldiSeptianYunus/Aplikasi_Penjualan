package tampilan;


public class UserID {
    private static String kd;
    private static String nm;
    
    public static void setUserLogin(String kode){
        kd = kode;
    }
    public static void setNamaLogin(String nama){
        nama = nm;
    }
    public static String getUserLogin(){
        return kd;
    }
    public static String getNamaLogin(){
        return nm;
    }
}
