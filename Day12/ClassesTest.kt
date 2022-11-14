fun main (){

    var SamsungGalaxyS20Ultra = MobilePhone("Android","Samsung","Galaxy S20 Ultra")
    var OnePlus9_5G = MobilePhone("Android","Oneplus","Oneplus 9 5G")
    var Iphone_14 = MobilePhone("IOS","Apple","Iphone 14")

}

class MobilePhone (osName : String , brand : String , model : String){

    init{
        println("OS : $osName")
        println("Brand : $brand")
        println("model : $model")
        println()
    }


}
