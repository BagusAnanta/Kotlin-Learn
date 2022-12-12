import java.net.InetAddress

class DeviceIP {

    // This Code Under Construction now, do not use!!!

    fun getWindowsSystemIP() : String?{
        return try {
            var SystemIP : String? = ""
            val OsName = System.getProperty("os.name")
            if (OsName.contains("Windows")) {
                SystemIP = InetAddress.getLocalHost().hostAddress
            } else {
                System.err.println("Sorry, you device is not Windows Operating System")
            }
            SystemIP
        } catch (E : Exception){
            System.err.println("System Exception $E")
            null
        }
    }
}