import kotlin.system.exitProcess

open class IPCheck(val line : Array<Int>) {

    open fun checkIPLength(){ // Check Length IP Address
        if(line.size > 4 || line.size < 4) {
            println("IP Length Incorrect,please try again")
            exitProcess(0)
        }
    }

    open fun checkIP(){
        checkIPLength()
        println("IP Checker")
        println("Binary :")
        checkIPBinary(line)
        println("\nIP Class   : ${checkIpClass(line)}")
        println("Network ID : ${checkNetworkID(line,checkIpClass(line))}")
        println("Host ID    : ${checkHostID(line,checkIpClass(line))}")
        println("Subnet Mask: ${checkSubnetMaskIP(checkIpClass(line))}")

    }

    open fun checkIPBinary(line: Array<Int>){
        for (E in line.iterator()){
            val ipBinary = Integer.toBinaryString(E)
            println("$E : $ipBinary")
        }
    }

    open fun checkIpClass(line: Array<Int>) : Char{

        var classType : Char = 'N'

        for(E in 0..127){
            if (line[0].equals(E)) classType = 'A'
        }

        for (E in 128..191){
            if (line[0].equals(E)) classType = 'B'
        }

        for (E in 192..223){
            if (line[0].equals(E)) classType = 'C'
        }

        return classType
    }

    open fun checkNetworkID(line: Array<Int>, classType : Char) : List<Int>{
        // this we make list for network Id
        var getNetID : IntArray = intArrayOf() // empty list
        try {
            when (classType) {
                'A' -> getNetID = listOf(line[0]).toIntArray()
                'B' -> getNetID = line.slice(0..1).toIntArray()
                'C' -> getNetID = line.slice(0..2).toIntArray()
            }
        } catch (IndexOutOfBoundEx : IndexOutOfBoundsException){
            println("""
                IndexOutOfBoundException Found At :
                - checkNetWorkID() function
                - Error Message : $IndexOutOfBoundEx
            """.trimIndent())
        }
        return getNetID.toList()
    }

    open fun checkHostID(line: Array<Int>, classType : Char) : List<Int>{
        // this we make list for network Id
        var getHostID : IntArray = intArrayOf() // empty list
        try {
            when(classType){
                'A' -> getHostID = line.slice(1..3).toIntArray()
                'B' -> getHostID = line.slice(2..3).toIntArray()
                'C' -> getHostID = listOf(line[3]).toIntArray()
            }
        } catch (IndexOutOfBoundEx : IndexOutOfBoundsException){
            println("""
                IndexOutOfBoundException Found At :
                - checkHostID() function
                - Error Message : $IndexOutOfBoundEx
            """.trimIndent())
        }
        return getHostID.toList()
    }

    open fun checkSubnetMaskIP(classType: Char) : List<Int>{
        var getSubnet : IntArray = intArrayOf()
        try{
            when(classType){
                'A' -> getSubnet = listOf(255,0,0,0).toIntArray()
                'B' -> getSubnet = listOf(255,255,0,0).toIntArray()
                'C' -> getSubnet = listOf(255,255,255,0).toIntArray()
            }
        } catch (IndexOutOfBoundEx : IndexOutOfBoundsException){
            println("""
                IndexOutOfBoundException Found At :
                - checkSubnetMaskIP() function
                - Error Message : $IndexOutOfBoundEx
            """.trimIndent())
        }
        return getSubnet.toList()
    }
}