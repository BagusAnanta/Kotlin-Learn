package singleton

class Inputdata : Inputdatauser() {

   fun Inputdata(data : String){
      // same, connect this use singleton
      Connectdatahelper.createdata()
   }
}